package com.uvish.recommender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "data")
public class UserData {
  @Id
  @GeneratedValue()
  @Column(name="id")
  private Long id;

  @Column(name = "publication_number")
  private String publicationNumber;

  @Column(name = "country_code")
  private String countryCode;

  @Column(name = "publication_kind_code")
  private String publicationKindCode;

  @Column(name = "pdf_pn")
  private String pdfPn;

  @Column(name = "truid")
  private String truid;

  @Column(name = "product")
  private String product;

  @Column(name = "doc_name")
  private String docName;

  @Column(name = "publication_year")
  private String publicationYear;


  @Column(name = "pdf_pgs")
  private String pdfPgs;

  @Column(name = "publication_date")
  private String publicationDate;

  @Column(name = "docid")
  private String docid;

  @Column(name="email")
  private String email;

  @Column(name="customer_name")
  private String customerName;

}
