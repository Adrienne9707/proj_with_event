package tsi.ensg.jee.reunions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import tsi.ensg.jee.reunions.model.Evenement;
import tsi.ensg.jee.reunions.model.Participant;
//import tsi.ensg.jee.reunions.service.ParticipantService;
import tsi.ensg.jee.reunions.service.ParticipantServiceImp;
import tsi.ensg.jee.reunions.service.EvenenementServiceImp;

import java.util.List;

@Controller
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class AppController {

   /* @Autowired
    private ParticipantService participantService;*/
   @Autowired
   private ParticipantServiceImp ParticipantService;
   @Autowired
   private EvenenementServiceImp EvenenementService;



   @RequestMapping("/participant")
    public String viewParticipantHomePage(Model model) {
        List<Participant> listParticipants = ParticipantService.listAll();
        model.addAttribute("listParticipants", listParticipants);

        return "participant";
    }


    @RequestMapping("/evenement")
    public String viewEventHomePage(Model model) {
        List<Evenement> listEvenements = EvenenementService.listAll();
        model.addAttribute("listEvenements", listEvenements);

        return "evenement";
    }

    @RequestMapping("/new")
    public String showNewParticipantPage(Model model) {
        Participant participant = new Participant();
        model.addAttribute("participant", participant);

        return "newParticipant";
    }


    @RequestMapping("/newEvent")
    public String showNewEventPage(Model model) {
        Evenement evenement = new Evenement();
        model.addAttribute("evenement", evenement);

        return "newEvenement";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveParticipant(@ModelAttribute("participant") Participant participant) {
        ParticipantService.save(participant);

        return "redirect:/participant";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveEvent(@ModelAttribute("evenement") Evenement evenement) {
        EvenenementService.save(evenement);

        return "redirect:/evenement";
    }


    @RequestMapping("/edit/{id}")
    public ModelAndView showEditParticipantPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("editEvent");
        Evenement evenement = EvenenementService.get(id);
        mav.addObject("evenement", evenement);

        return mav;
    }


    @RequestMapping("/delete/{id}")
    public String deleteParticipant(@PathVariable(name = "id") int id) {
        EvenenementService.delete(id);
        return "redirect:/evenement";
    }

   /*

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Participant> listParticipants = participantService.listParticipants();
        model.addAttribute("listParticipants", listParticipants);

        return "participant";
    }*/

  /* @GetMapping("/form")
   public String viewForm(@RequestParam(name="name", required=false) String name, Model model) {
       model.addAttribute("name", name);
       return "form";
   }*/



}
