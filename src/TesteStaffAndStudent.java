public class TesteStaffAndStudent {
    public static void main(String[] args) {
        Student student = new Student("Sophia", "Rua Oito, 54", "CSc", 2, 5);
        System.out.println("Nome do aluno: " + student.getName());
        System.out.println("Endereço: " + student.getAddress());
        student.setAddress("Avenida do Vale, 6");
        System.out.println("Endereço novo: " + student.getAddress());
        System.out.println("Programa do aluno: " + student.getProgram());
        student.setProgram("MBA");
        System.out.println("Novo programa do aluno: " + student.getProgram());
        System.out.println("Ano de curso: " + student.getYear());
        student.setYear(6);
        System.out.println("Ano atualizado: " + student.getYear());
        System.out.println("Débito estudantil: " + student.getFee());
        student.setFee(2000);
        System.out.println("Débito atualizado: " + student.getFee());
        System.out.println(student);

        System.out.println();

        Staff staff = new Staff("Wellington", "Rua Visconde, 10", "IFSP", 6000);
        System.out.println("Escola: "+ staff.getSchool());
        staff.setSchool("UFABC");
        System.out.println("Escola nova: " + staff.getSchool());
        System.out.println("Pagamento: R$" + staff.getPay());
        staff.setPay(9000);
        System.out.println("Novo pagamento: R$" + staff.getPay());
        System.out.println(staff);
    }
}