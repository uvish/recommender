package com.uvish.recommender;

import javax.persistence.*;

@Entity
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

  public UserData(Long id, String publicationNumber, String countryCode, String publicationKindCode, String pdfPn, String truid, String product, String docName, String publicationYear, String pdfPgs, String publicationDate, String docid, String email, String customerName) {
    this.id = id;
    this.publicationNumber = publicationNumber;
    this.countryCode = countryCode;
    this.publicationKindCode = publicationKindCode;
    this.pdfPn = pdfPn;
    this.truid = truid;
    this.product = product;
    this.docName = docName;
    this.publicationYear = publicationYear;
    this.pdfPgs = pdfPgs;
    this.publicationDate = publicationDate;
    this.docid = docid;
    this.email = email;
    this.customerName = customerName;
  }

  public UserData() {
  }

  public Long getId() {
    return this.id;
  }

  public String getPublicationNumber() {
    return this.publicationNumber;
  }

  public String getCountryCode() {
    return this.countryCode;
  }

  public String getPublicationKindCode() {
    return this.publicationKindCode;
  }

  public String getPdfPn() {
    return this.pdfPn;
  }

  public String getTruid() {
    return this.truid;
  }

  public String getProduct() {
    return this.product;
  }

  public String getDocName() {
    return this.docName;
  }

  public String getPublicationYear() {
    return this.publicationYear;
  }

  public String getPdfPgs() {
    return this.pdfPgs;
  }

  public String getPublicationDate() {
    return this.publicationDate;
  }

  public String getDocid() {
    return this.docid;
  }

  public String getEmail() {
    return this.email;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setPublicationNumber(String publicationNumber) {
    this.publicationNumber = publicationNumber;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public void setPublicationKindCode(String publicationKindCode) {
    this.publicationKindCode = publicationKindCode;
  }

  public void setPdfPn(String pdfPn) {
    this.pdfPn = pdfPn;
  }

  public void setTruid(String truid) {
    this.truid = truid;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public void setDocName(String docName) {
    this.docName = docName;
  }

  public void setPublicationYear(String publicationYear) {
    this.publicationYear = publicationYear;
  }

  public void setPdfPgs(String pdfPgs) {
    this.pdfPgs = pdfPgs;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof UserData)) return false;
    final UserData other = (UserData) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$publicationNumber = this.getPublicationNumber();
    final Object other$publicationNumber = other.getPublicationNumber();
    if (this$publicationNumber == null ? other$publicationNumber != null : !this$publicationNumber.equals(other$publicationNumber))
      return false;
    final Object this$countryCode = this.getCountryCode();
    final Object other$countryCode = other.getCountryCode();
    if (this$countryCode == null ? other$countryCode != null : !this$countryCode.equals(other$countryCode))
      return false;
    final Object this$publicationKindCode = this.getPublicationKindCode();
    final Object other$publicationKindCode = other.getPublicationKindCode();
    if (this$publicationKindCode == null ? other$publicationKindCode != null : !this$publicationKindCode.equals(other$publicationKindCode))
      return false;
    final Object this$pdfPn = this.getPdfPn();
    final Object other$pdfPn = other.getPdfPn();
    if (this$pdfPn == null ? other$pdfPn != null : !this$pdfPn.equals(other$pdfPn)) return false;
    final Object this$truid = this.getTruid();
    final Object other$truid = other.getTruid();
    if (this$truid == null ? other$truid != null : !this$truid.equals(other$truid)) return false;
    final Object this$product = this.getProduct();
    final Object other$product = other.getProduct();
    if (this$product == null ? other$product != null : !this$product.equals(other$product)) return false;
    final Object this$docName = this.getDocName();
    final Object other$docName = other.getDocName();
    if (this$docName == null ? other$docName != null : !this$docName.equals(other$docName)) return false;
    final Object this$publicationYear = this.getPublicationYear();
    final Object other$publicationYear = other.getPublicationYear();
    if (this$publicationYear == null ? other$publicationYear != null : !this$publicationYear.equals(other$publicationYear))
      return false;
    final Object this$pdfPgs = this.getPdfPgs();
    final Object other$pdfPgs = other.getPdfPgs();
    if (this$pdfPgs == null ? other$pdfPgs != null : !this$pdfPgs.equals(other$pdfPgs)) return false;
    final Object this$publicationDate = this.getPublicationDate();
    final Object other$publicationDate = other.getPublicationDate();
    if (this$publicationDate == null ? other$publicationDate != null : !this$publicationDate.equals(other$publicationDate))
      return false;
    final Object this$docid = this.getDocid();
    final Object other$docid = other.getDocid();
    if (this$docid == null ? other$docid != null : !this$docid.equals(other$docid)) return false;
    final Object this$email = this.getEmail();
    final Object other$email = other.getEmail();
    if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
    final Object this$customerName = this.getCustomerName();
    final Object other$customerName = other.getCustomerName();
    if (this$customerName == null ? other$customerName != null : !this$customerName.equals(other$customerName))
      return false;
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof UserData;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $publicationNumber = this.getPublicationNumber();
    result = result * PRIME + ($publicationNumber == null ? 43 : $publicationNumber.hashCode());
    final Object $countryCode = this.getCountryCode();
    result = result * PRIME + ($countryCode == null ? 43 : $countryCode.hashCode());
    final Object $publicationKindCode = this.getPublicationKindCode();
    result = result * PRIME + ($publicationKindCode == null ? 43 : $publicationKindCode.hashCode());
    final Object $pdfPn = this.getPdfPn();
    result = result * PRIME + ($pdfPn == null ? 43 : $pdfPn.hashCode());
    final Object $truid = this.getTruid();
    result = result * PRIME + ($truid == null ? 43 : $truid.hashCode());
    final Object $product = this.getProduct();
    result = result * PRIME + ($product == null ? 43 : $product.hashCode());
    final Object $docName = this.getDocName();
    result = result * PRIME + ($docName == null ? 43 : $docName.hashCode());
    final Object $publicationYear = this.getPublicationYear();
    result = result * PRIME + ($publicationYear == null ? 43 : $publicationYear.hashCode());
    final Object $pdfPgs = this.getPdfPgs();
    result = result * PRIME + ($pdfPgs == null ? 43 : $pdfPgs.hashCode());
    final Object $publicationDate = this.getPublicationDate();
    result = result * PRIME + ($publicationDate == null ? 43 : $publicationDate.hashCode());
    final Object $docid = this.getDocid();
    result = result * PRIME + ($docid == null ? 43 : $docid.hashCode());
    final Object $email = this.getEmail();
    result = result * PRIME + ($email == null ? 43 : $email.hashCode());
    final Object $customerName = this.getCustomerName();
    result = result * PRIME + ($customerName == null ? 43 : $customerName.hashCode());
    return result;
  }

  public String toString() {
    return "UserData(id=" + this.getId() + ", publicationNumber=" + this.getPublicationNumber() + ", countryCode=" + this.getCountryCode() + ", publicationKindCode=" + this.getPublicationKindCode() + ", pdfPn=" + this.getPdfPn() + ", truid=" + this.getTruid() + ", product=" + this.getProduct() + ", docName=" + this.getDocName() + ", publicationYear=" + this.getPublicationYear() + ", pdfPgs=" + this.getPdfPgs() + ", publicationDate=" + this.getPublicationDate() + ", docid=" + this.getDocid() + ", email=" + this.getEmail() + ", customerName=" + this.getCustomerName() + ")";
  }
}
