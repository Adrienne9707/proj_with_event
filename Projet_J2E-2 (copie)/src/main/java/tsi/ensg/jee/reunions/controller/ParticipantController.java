package tsi.ensg.jee.reunions.controller;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tsi.ensg.jee.reunions.model.Participant;
import tsi.ensg.jee.reunions.service.ParticipantService;

@Controller
public class ParticipantController {
    private ParticipantService participantService;

    @Autowired(required = true)
    @Qualifier(value = "participantService")
    public void setParticipantService(ParticipantService partService){

        this.participantService = partService;
    }

    @RequestMapping(value = "/participants", method = RequestMethod.GET)
    public String listParticipant(Model model){
        model.addAttribute("participant", new Participant());
        model.addAttribute("listParticipant", this.participantService.listParticipants());
        return "participant";
    }


    //add and update
    @RequestMapping(value = "/participant/add", method = RequestMethod.POST)
    public String addParticipant(@ModelAttribute("participant") Participant participant){
        if(participant.getId() == 0){
            //add new participant
            this.participantService.addParticipant(participant);
        }else {
            // update an existing participant
            this.participantService.updateParticipant(participant);
        }
        return "redirect:/participants";
    }


    @RequestMapping("/remove/{id}")
    public String removeParticipant(@PathVariable("id") int id){
        this.participantService.removeParticipant(id);
        return "redirect:/participants";
    }

}
*/