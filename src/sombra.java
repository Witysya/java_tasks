package com.company;

abstract class sombra {
    public int currentSalary;

    abstract public void calculateSalary();

    abstract public void whatIShouldDo();

    static String contacts = new String("+38 (032) 253 80 76");
    static String address = new String("Uhorska St, 14, Uhorska St, 14, Lviv, Lviv Oblast, 79000");

    public static void main(String[] args) {
        System.out.println("Contacts: " + contacts + "\nAddress: " + address);
    }

    abstract class Developer extends sombra {
        abstract class BE extends Developer {
        }

        public String name;

        public void getName(String name) {
            this.name = name;
        }


        public String surname;

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String experience;

        public void setExperience(String experience) {
            this.experience = experience;
        }

        public int phone;

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public int salaryRate;

        public void setsalaryRate(int salaryRate) {
            this.salaryRate = salaryRate;
        }

        abstract class FE extends Developer {
        }

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
            abstract class Accountant extends sombra {
            }
            abstract class Manager extends sombra {
            }
        }
    }
}
