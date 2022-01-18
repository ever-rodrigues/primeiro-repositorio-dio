
import javax.swing.*;
public class Desafio {
    public static void main(String[] args) {
        String sair;
        String conferesenha;
        String senha=JOptionPane.showInputDialog(null,"Digite uma senha para cadastro:");
        boolean acesso=true;
        while (acesso) {
            conferesenha=JOptionPane.showInputDialog(null,"Digite uma senha de acesso:");
            if (senha.equalsIgnoreCase(conferesenha)) {
                JOptionPane.showMessageDialog(null,"Acesso permitido!");
                acesso = false;
            } else {
                JOptionPane.showMessageDialog(null,"Acesso nao permitido!");
                sair=JOptionPane.showInputDialog(null,"Diseja tentar novamente?");
                if(sair.contains("s")||sair.contains("S")){
                    acesso=true;
                }
                else acesso=false;
            }
        }
    }
}
