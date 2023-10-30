package org.example;


    /*create two variables for number of pets and doctors.
    create a queue method
    explain all the methods with comments*/
public class PetclinicFCFS {
    private int numberOfPets;
    private int numberOfDoctors;
    private int[] queue;

    public PetclinicFCFS(int numberOfPets, int numberOfDoctors) {
        this.numberOfPets = numberOfPets;
        this.numberOfDoctors = numberOfDoctors;
        this.queue = new int[numberOfPets];
    }

    public void addPet(int petId) {
        for (int i = 0; i < numberOfPets; i++) {
            if (queue[i] == 0) {
                queue[i] = petId;
                break;
            }
        }
    }

    public void removePet() {
        for (int i = 0; i < numberOfPets - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[numberOfPets - 1] = 0;
    }

    public void printQueue() {
        for (int i = 0; i < numberOfPets; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PetclinicFCFS petclinicFCFS = new PetclinicFCFS(5, 2);
        petclinicFCFS.addPet(1);
        petclinicFCFS.addPet(2);
        petclinicFCFS.addPet(3);
        petclinicFCFS.addPet(4);
        petclinicFCFS.addPet(5);
        petclinicFCFS.printQueue();
        petclinicFCFS.removePet();
        petclinicFCFS.printQueue();
        petclinicFCFS.addPet(6);
        petclinicFCFS.printQueue();
    }
}
