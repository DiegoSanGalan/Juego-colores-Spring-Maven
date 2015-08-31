package servicioweb;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import clasesDTO.Jugador;

@Controller
public class ServicioWebSpring {

	@RequestMapping(path="/tiempoJSON", produces="application/json")
	@ResponseBody
	public ResponseEntity <Jugador> jugadorJSON(@RequestParam(value="minutos", required=false, defaultValue="1") int minutos,
			@RequestParam(value="segundos", required=false, defaultValue="1") int segundos)
	{
		Jugador j=null;
		j= new Jugador("Diego", "12s", minutos, segundos);
		System.out.println("minutos: "+ minutos);
		System.out.println("segundos: " + segundos);
		return new ResponseEntity<Jugador>(j, HttpStatus.OK);
	}
}
