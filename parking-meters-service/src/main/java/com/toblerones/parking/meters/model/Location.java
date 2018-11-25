package com.toblerones.parking.meters.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Location
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-11-25T22:07:29.638+11:00[Australia/Sydney]")

public class Location   {
  @JsonProperty("xloc")
  private String xloc;

  @JsonProperty("yloc")
  private String yloc;

  public Location xloc(String xloc) {
    this.xloc = xloc;
    return this;
  }

  /**
   * X alias
   * @return xloc
  */
  @ApiModelProperty(value = "X alias")


  public String getXloc() {
    return xloc;
  }

  public void setXloc(String xloc) {
    this.xloc = xloc;
  }

  public Location yloc(String yloc) {
    this.yloc = yloc;
    return this;
  }

  /**
   * X alias
   * @return yloc
  */
  @ApiModelProperty(value = "X alias")


  public String getYloc() {
    return yloc;
  }

  public void setYloc(String yloc) {
    this.yloc = yloc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.xloc, location.xloc) &&
        Objects.equals(this.yloc, location.yloc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xloc, yloc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    xloc: ").append(toIndentedString(xloc)).append("\n");
    sb.append("    yloc: ").append(toIndentedString(yloc)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

