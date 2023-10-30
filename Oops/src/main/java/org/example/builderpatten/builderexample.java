package org.example.builderpatten;

//create an example of builder pattern in design principles
public class builderexample {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    public builderexample(String name, int age, String address, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static class builder {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;
        private String email;

        public builder setName(String name) {
            this.name = name;
            return this;
        }

        public builder setAge(int age) {
            this.age = age;
            return this;
        }

        public builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public builderexample build() {
            return new builderexample(name, age, address, phoneNumber, email);
        }
    }

    public static void main(String[] args) {
        builderexample builderexample = new builderexample.builder()
                .setName("John")
                .setAge(20)
                .setAddress("123 Main St")
                .setPhoneNumber("1234567890")
                .setEmail("prajwal@gmail.com")
                .build();
        System.out.println(builderexample);
    }
}

