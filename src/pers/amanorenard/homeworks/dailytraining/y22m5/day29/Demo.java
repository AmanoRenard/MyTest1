package pers.amanorenard.homeworks.dailytraining.y22m5.day29;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

class Demo extends Simpl. Chinese {
    public static void main(String[] args) {
        new Thread(new Send(), "发送").start();
        Thread listening = new Thread(new Listening(), "监听");
        listening.setDaemon(true);
        listening.start();
    }}
class Send extends Simpl. Chinese implements Runnable {
    public void run() {
        var sc = new Scanner(System.in);
        输出("请输入接收方IP：");
        var ip = sc.nextLine();
        输出("你的名字：");
        var name = sc.nextLine();
        String input;
        输出(false,"请输入要发送的内容：\n<"+name+"> ");
        while (!(input = sc.nextLine()).equals("quit")) {
            try (
                    var ds = new DatagramSocket()
            ) {
                var bys = ("<"+name+"> "+input).getBytes();
                var dp =
                        new DatagramPacket(bys, 0, bys.length,
                                InetAddress.getByName(ip), 6666 );
                ds.send(dp);
            } catch (Exception e) {
                e.printStackTrace();}
            输出(false, "<"+name+"> ");
        }}}
class Listening extends Simpl. Chinese implements Runnable {
    public void run() {
        while (true) {
            try (
                    var ds = new DatagramSocket(6666)
            ) {
                var dp = new DatagramPacket(new byte[1024], 1024);
                var bys = dp.getData();
                ds.receive(dp);
                输出(new String(bys, 0, dp.getLength())
                );
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}