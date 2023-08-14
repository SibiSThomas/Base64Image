package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import study.model.Player;
import study.service.PlayerService;

@CrossOrigin
@Controller
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	@PostMapping ("/save")
	@ResponseBody
	public Player savePlayer(String playerName, int age, MultipartFile file) {
		return playerService.savePlayer(playerName, age, file);
	}
	
	@GetMapping("/findAll")
	@ResponseBody
	public List<Player> getList(){
		return playerService.findAll();
	}
}
