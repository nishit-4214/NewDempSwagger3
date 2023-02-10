import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Token {
	public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
	
	@Test
	public void test_JUnit() {
        System.out.println("max salary ::");
        int [] salary = {14 ,46, 47, 45, 92, 52, 48, 36, 66, 85};
		List<Integer> listSalry = Arrays.stream(salary).boxed().collect(Collectors.toList());
		Optional<Integer> secondHighSalary = listSalry.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();      
		assertEquals(85, secondHighSalary.get());
		assertNotEquals(89, secondHighSalary.get());
    } 
	
	@Test
	public void doGenerateToken() {
		System.out.println("caaling token method");
		Map<String, Object> claims = new HashMap<>();
		String subject = "Nishit";
		String token =  Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
				.signWith(SignatureAlgorithm.HS512, "Nishit").setAudience("audience").setId(String.valueOf(Math.random())).compact();
		System.out.println("bearer " +token);
		int s = 89;
		assertEquals(89, s);
	
	}
	
}
