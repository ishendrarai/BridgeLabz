public class day_8_timeZone {
    public static void main(String[] args) {
        //Q1)
        /*ZonedDateTime gmtTime=ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println(gmtTime);

        ZonedDateTime istTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(istTime);

        ZonedDateTime pstTime=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(pstTime);*/
        //Q2)
      /*  LocalDate date = LocalDate.of(2025, 8, 27);


                LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);


                LocalDate finalDate = newDate.minusWeeks(3);

                System.out.println("Original Date: " + date);
                System.out.println("After Operations: " + finalDate);
            }*/
        //Q3)



                /*LocalDate today = LocalDate.now();

                // Different formats
                DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

                System.out.println("Format 1: " + today.format(format1));
                System.out.println("Format 2: " + today.format(format2));
                System.out.println("Format 3: " + today.format(format3));
            }
        }
*/
        //Q4)

        /*LocalDate date1 = LocalDate.of(2025, 8, 27);
        LocalDate date2 = LocalDate.of(2026, 1, 15);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is the same as " + date2);
        }*/


    }
}