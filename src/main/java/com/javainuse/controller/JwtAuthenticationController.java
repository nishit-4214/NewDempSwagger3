package com.javainuse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;*/

/*import com.nishit.jwt.JwtRequest;
import com.nishit.jwt.JwtResponse;
import com.nishit.jwt.JwtTokenUtil;
import com.nishit.jwt.JwtUserDetailsService;*/

@RestController("testApi")
/*
 * @CrossOrigin
 */
public class JwtAuthenticationController {
//Taken example from below url 
	//https://medium.com/swlh/spring-boot-security-jwt-hello-world-example-b479e457664c
	
	//@Autowired
	//private AuthenticationManager authenticationManager;
	/*
	 * @Autowired private JwtTokenUtil jwtTokenUtil;
	 * 
	 * @Autowired private JwtUserDetailsService userDetailsService;
	 */
	
	/*
	 * @RequestMapping(value = "/authenticate", method = RequestMethod.POST) public
	 * ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest
	 * authenticationRequest) throws Exception {
	 * //authenticate(authenticationRequest.getUsername(),
	 * authenticationRequest.getPassword()); final UserDetails userDetails =
	 * userDetailsService .loadUserByUsername(authenticationRequest.getUsername());
	 * final String token = jwtTokenUtil.generateToken(userDetails); return
	 * ResponseEntity.ok(new JwtResponse(token)); }
	 */
	
	/*
	 * private void authenticate(String username, String password) throws Exception
	 * { try { //authenticationManager.authenticate(new
	 * UsernamePasswordAuthenticationToken(username, password)); } catch
	 * (DisabledException e) { throw new Exception("USER_DISABLED", e); } catch
	 * (BadCredentialsException e) { throw new Exception("INVALID_CREDENTIALS", e);
	 * } }
	 */
	
	@GetMapping("Test")
	public String testController() {
		
		return "Test successful!";
	}
}
