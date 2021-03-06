package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.AttachmentPublic;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;

/**
 * bunq.me public profile of the user.
 */
public class BunqMeFundraiserProfile extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_POINTER = "pointer";

  /**
   * The color chosen for the bunq.me fundraiser profile in hexadecimal format.
   */
  @Expose
  @SerializedName("color")
  private String color;

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccount alias;

  /**
   * The description of the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The attachments attached to the fundraiser profile.
   */
  @Expose
  @SerializedName("attachment")
  private List<AttachmentPublic> attachment;

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("pointer")
  private Pointer pointer;

  /**
   * The status of the bunq.me fundraiser profile, can be ACTIVE or DEACTIVATED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The URL which the user is sent to when a payment is completed.
   */
  @Expose
  @SerializedName("redirect_url")
  private String redirectUrl;

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("pointer_field_for_request")
  private Pointer pointerFieldForRequest;

  public BunqMeFundraiserProfile() {
    this(null);
  }

  public BunqMeFundraiserProfile(Pointer pointer) {
    this.pointerFieldForRequest = pointer;
  }

  /**
   * The color chosen for the bunq.me fundraiser profile in hexadecimal format.
   */
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me fundraiser profile.
   */
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
    this.alias = alias;
  }

  /**
   * The description of the bunq.me fundraiser profile.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The attachments attached to the fundraiser profile.
   */
  public List<AttachmentPublic> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentPublic> attachment) {
    this.attachment = attachment;
  }

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  public Pointer getPointer() {
    return this.pointer;
  }

  public void setPointer(Pointer pointer) {
    this.pointer = pointer;
  }

  /**
   * The status of the bunq.me fundraiser profile, can be ACTIVE or DEACTIVATED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The URL which the user is sent to when a payment is completed.
   */
  public String getRedirectUrl() {
    return this.redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.color != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.pointer != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.redirectUrl != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeFundraiserProfile fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeFundraiserProfile.class, reader);
  }

}
