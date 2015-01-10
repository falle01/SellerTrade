/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class feed_status {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected feed_status(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(feed_status obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_feed_status(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public feed_status() {
    this(libtorrent_jni.new_feed_status(), true);
  }

  public void setUrl(String value) {
    libtorrent_jni.feed_status_url_set(swigCPtr, this, value);
  }

  public String getUrl() {
    return libtorrent_jni.feed_status_url_get(swigCPtr, this);
  }

  public void setTitle(String value) {
    libtorrent_jni.feed_status_title_set(swigCPtr, this, value);
  }

  public String getTitle() {
    return libtorrent_jni.feed_status_title_get(swigCPtr, this);
  }

  public void setDescription(String value) {
    libtorrent_jni.feed_status_description_set(swigCPtr, this, value);
  }

  public String getDescription() {
    return libtorrent_jni.feed_status_description_get(swigCPtr, this);
  }

  public void setLast_update(int value) {
    libtorrent_jni.feed_status_last_update_set(swigCPtr, this, value);
  }

  public int getLast_update() {
    return libtorrent_jni.feed_status_last_update_get(swigCPtr, this);
  }

  public void setNext_update(int value) {
    libtorrent_jni.feed_status_next_update_set(swigCPtr, this, value);
  }

  public int getNext_update() {
    return libtorrent_jni.feed_status_next_update_get(swigCPtr, this);
  }

  public void setUpdating(boolean value) {
    libtorrent_jni.feed_status_updating_set(swigCPtr, this, value);
  }

  public boolean getUpdating() {
    return libtorrent_jni.feed_status_updating_get(swigCPtr, this);
  }

  public void setItems(feed_item_vector value) {
    libtorrent_jni.feed_status_items_set(swigCPtr, this, feed_item_vector.getCPtr(value), value);
  }

  public feed_item_vector getItems() {
    long cPtr = libtorrent_jni.feed_status_items_get(swigCPtr, this);
    return (cPtr == 0) ? null : new feed_item_vector(cPtr, false);
  }

  public void setError(error_code value) {
    libtorrent_jni.feed_status_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.feed_status_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public void setTtl(int value) {
    libtorrent_jni.feed_status_ttl_set(swigCPtr, this, value);
  }

  public int getTtl() {
    return libtorrent_jni.feed_status_ttl_get(swigCPtr, this);
  }

}
