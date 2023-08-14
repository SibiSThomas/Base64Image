package study.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import study.model.Player;
import study.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;
	
		
	public Player savePlayer(String playerName, int age, MultipartFile file) {
		
		Player player = new Player();
		player.setPlayerName(playerName);
		player.setAge(age);
		player.setFileName(file.getOriginalFilename());
		player.setFileType(file.getContentType());
		try {
			player.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return playerRepository.save(player);
		
	}
	
	public List<Player> findAll(){
		return playerRepository.findAll();
	}
}
