package ru.netologia;

import ru.netologia.service.CashbackHackService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        System.out.println(service.remain(1000));
    }
}