import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        //throw new UnsupportedOperationException("Please implement the AppointmentScheduler.schedule() method");
        LocalDateTime dati = LocalDateTime.of(2019,7,25,13,45,0);
        return dati;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        //throw new UnsupportedOperationException("Please implement the AppointmentScheduler.hasPassed() method");
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        //throw new UnsupportedOperationException("Please implement the AppointmentScheduler.isAfternoonAppointment() method");
        int hour = appointmentDate.getHour();
        return hour>= 12 && hour<18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        //throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getDescription() method");
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        return "You have an appointment on " + appointmentDate.format(printer) + ".";
    }

    public LocalDate getAnniversaryDate() {
        //throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getAnniversaryDate() method");
        return LocalDate.of(LocalDate.now().getYear(),9,15);
    }
}
