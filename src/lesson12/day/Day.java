package lesson12.day;

    enum Day {
        MONDAY(1, "Pirmadienis"),
        TUESDAY(2, "Antradienis"),
        WEDNESDAY(3, "Trečiadienis"),
        THURSDAY(4, "Ketvirtadienis"),
        FRIDAY(5, "Penktadienis") {
            @Override
            public String getName() {
                return "Pagaliau " + super.getName() + "!";
            }
        },
        SATURDAY(6, "Šeštadienis"),
        SUNDAY(7, "Sekmadienis");

        // tik private
        Day(int number, String name) {
            this.number = number;
            this.name = name;
        }

        private int number;
        private String name;

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }
    }
