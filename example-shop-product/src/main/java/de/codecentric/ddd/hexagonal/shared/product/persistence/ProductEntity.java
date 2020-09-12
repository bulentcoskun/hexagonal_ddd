package de.codecentric.ddd.hexagonal.shared.product.persistence;

import de.codecentric.ddd.hexagonal.domain.product.api.PackagingType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
  @Id
  @Column( length=16, nullable = false, unique = true)
  private UUID          id;
  private String        name;
  @Enumerated(EnumType.STRING)
  @Column(length=24)
  private PackagingType packagingType;
  @Column( length=20)
  private String        price;
  @Column( length=10)
  private String        amount;
}