package cu.humberto.wastemanageraddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class WasteManagerAddressApplication {



    public static void main(String[] args) {
        SpringApplication.run(WasteManagerAddressApplication.class, args);
    }

}
