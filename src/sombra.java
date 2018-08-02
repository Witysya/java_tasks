package com.company;

abstract class sombra {
    public int currentSalary;

    abstract public void calculateSalary();

    abstract public void whatIShouldDo();
    /*
    TODO make final because this string constant and will not change in code
    You can declare String without operator new
    String address = "bla bla bla";
     */
    static String contacts = new String("+38 (032) 253 80 76");
    static String address = new String("Uhorska St, 14, Uhorska St, 14, Lviv, Lviv Oblast, 79000");

    // TODO main method shouldn't be here. main() method should be written in Main class
    // TODO create method showCompanyInfo() method
    public static void main(String[] args) {
        System.out.println("Contacts: " + contacts + "\nAddress: " + address);
    }

    // TODO create not inner classes
    abstract class Developer extends sombra {
        // TODO not inner and not abstract because you need to create object of this class
        abstract class BE extends Developer {
        }

        // TODO add get() methods for all necessaries fields and make fields private
        public String name;

        public void getName(String name) {
            this.name = name;
        }

        // TODO make fields private
        public String surname;

        public void setSurname(String surname) {
            this.surname = surname;
        }

        // TODO make fields private
        public String experience;

        public void setExperience(String experience) {
            this.experience = experience;
        }

        // TODO make fields private
        public int phone;

        public void setPhone(int phone) {
            this.phone = phone;
        }

        // TODO make fields private
        public int salaryRate;

        public void setsalaryRate(int salaryRate) {
            this.salaryRate = salaryRate;
        }

        // TODO not inner and not abstract because you need to create object of this class
        abstract class FE extends Developer {
        }

        // TODO not inner and not abstract because you need to create object of this class
        abstract class QA extends Developer {
        }

        @Override
        public void whatIShouldDo() {
        }

        ;

        @Override
        public void calculateSalary() {
            int monthSalary;
            monthSalary = (currentSalary * salaryRate);

            // TODO not inner and not abstract because you need to create object of this class
            abstract class Accountant extends sombra {
            }

            // TODO not inner and not abstract because you need to create object of this class
            abstract class Manager extends sombra {
            }
        }
    }
}
