public class Painter {
        private int id;
        private String name;
        private String phoneNum;
        private String city;
        private float charge;

        public Painter(int id, String name, String phoneNum, String city, float charge) {
            this.id = id;
            this.name = name;
            this.phoneNum = phoneNum;
            this.city = city;
            this.charge = charge;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city= city;
        }

        public float getCharge() {
            return charge;
        }

        public void setCharge(float charge) {
            this.charge= charge;
        }
    }
