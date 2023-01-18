package OnlineLibraryIndividualProject.IndividualProject.controller;

import OnlineLibraryIndividualProject.IndividualProject.entity.Reservation;
import OnlineLibraryIndividualProject.IndividualProject.repository.ReservationRevository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reservation")
@CrossOrigin(origins = "*")
public class ReservationController {
    private final ReservationRevository reservationRevository;

    @Autowired
    public ReservationController(ReservationRevository reservationRevository) {
        this.reservationRevository = reservationRevository;
    }

    @PostMapping("/addReservation")
    public void addReservation(@RequestBody Reservation reservation){
        reservationRevository.save(reservation);

    }
    @GetMapping("/checkReservation/{student}/{book}")
    public int checkReservation(@PathVariable Long student, @PathVariable Long book){
        Reservation r=reservationRevository.findByStudentAndBook(student,book);
        if(r==null){
            return 1;//nu s-a gasit valoarea
        }else{
            return 0;}//rezervare efectuata

    }
}
