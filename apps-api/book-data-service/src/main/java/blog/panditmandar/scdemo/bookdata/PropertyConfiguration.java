package blog.panditmandar.scdemo.bookdata;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Mandar Pandit
 *
 */
@Component
@ConfigurationProperties(prefix = "limit")
@Getter
@Setter
public class PropertyConfiguration {

	private Byte max;

}
