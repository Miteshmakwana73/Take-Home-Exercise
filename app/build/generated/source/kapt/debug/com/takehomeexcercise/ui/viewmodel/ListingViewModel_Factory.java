// Generated by Dagger (https://dagger.dev).
package com.takehomeexcercise.ui.viewmodel;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ListingViewModel_Factory implements Factory<ListingViewModel> {
  @Override
  public ListingViewModel get() {
    return newInstance();
  }

  public static ListingViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ListingViewModel newInstance() {
    return new ListingViewModel();
  }

  private static final class InstanceHolder {
    private static final ListingViewModel_Factory INSTANCE = new ListingViewModel_Factory();
  }
}
