package com.itg.devconfig;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.itg.devconfig.databinding.ActivityDeveloperChecklistBindingImpl;
import com.itg.devconfig.databinding.DialogAdminOrganicAdsBindingImpl;
import com.itg.devconfig.databinding.ItemDeveloperChecklistAdBindingImpl;
import com.itg.devconfig.databinding.ItemDeveloperChecklistInfoBindingImpl;
import com.itg.devconfig.databinding.ItemDeveloperChecklistMediationBindingImpl;
import com.itg.devconfig.databinding.ItemDeveloperChecklistMediationHeaderBindingImpl;
import com.itg.devconfig.databinding.ItemDeveloperChecklistSectionBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDEVELOPERCHECKLIST = 1;

  private static final int LAYOUT_DIALOGADMINORGANICADS = 2;

  private static final int LAYOUT_ITEMDEVELOPERCHECKLISTAD = 3;

  private static final int LAYOUT_ITEMDEVELOPERCHECKLISTINFO = 4;

  private static final int LAYOUT_ITEMDEVELOPERCHECKLISTMEDIATION = 5;

  private static final int LAYOUT_ITEMDEVELOPERCHECKLISTMEDIATIONHEADER = 6;

  private static final int LAYOUT_ITEMDEVELOPERCHECKLISTSECTION = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itg.devconfig.R.layout.activity_developer_checklist, LAYOUT_ACTIVITYDEVELOPERCHECKLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itg.devconfig.R.layout.dialog_admin_organic_ads, LAYOUT_DIALOGADMINORGANICADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itg.devconfig.R.layout.item_developer_checklist_ad, LAYOUT_ITEMDEVELOPERCHECKLISTAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itg.devconfig.R.layout.item_developer_checklist_info, LAYOUT_ITEMDEVELOPERCHECKLISTINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itg.devconfig.R.layout.item_developer_checklist_mediation, LAYOUT_ITEMDEVELOPERCHECKLISTMEDIATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itg.devconfig.R.layout.item_developer_checklist_mediation_header, LAYOUT_ITEMDEVELOPERCHECKLISTMEDIATIONHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itg.devconfig.R.layout.item_developer_checklist_section, LAYOUT_ITEMDEVELOPERCHECKLISTSECTION);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDEVELOPERCHECKLIST: {
          if ("layout/activity_developer_checklist_0".equals(tag)) {
            return new ActivityDeveloperChecklistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_developer_checklist is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGADMINORGANICADS: {
          if ("layout/dialog_admin_organic_ads_0".equals(tag)) {
            return new DialogAdminOrganicAdsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_admin_organic_ads is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDEVELOPERCHECKLISTAD: {
          if ("layout/item_developer_checklist_ad_0".equals(tag)) {
            return new ItemDeveloperChecklistAdBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_developer_checklist_ad is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDEVELOPERCHECKLISTINFO: {
          if ("layout/item_developer_checklist_info_0".equals(tag)) {
            return new ItemDeveloperChecklistInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_developer_checklist_info is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDEVELOPERCHECKLISTMEDIATION: {
          if ("layout/item_developer_checklist_mediation_0".equals(tag)) {
            return new ItemDeveloperChecklistMediationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_developer_checklist_mediation is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDEVELOPERCHECKLISTMEDIATIONHEADER: {
          if ("layout/item_developer_checklist_mediation_header_0".equals(tag)) {
            return new ItemDeveloperChecklistMediationHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_developer_checklist_mediation_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDEVELOPERCHECKLISTSECTION: {
          if ("layout/item_developer_checklist_section_0".equals(tag)) {
            return new ItemDeveloperChecklistSectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_developer_checklist_section is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_developer_checklist_0", com.itg.devconfig.R.layout.activity_developer_checklist);
      sKeys.put("layout/dialog_admin_organic_ads_0", com.itg.devconfig.R.layout.dialog_admin_organic_ads);
      sKeys.put("layout/item_developer_checklist_ad_0", com.itg.devconfig.R.layout.item_developer_checklist_ad);
      sKeys.put("layout/item_developer_checklist_info_0", com.itg.devconfig.R.layout.item_developer_checklist_info);
      sKeys.put("layout/item_developer_checklist_mediation_0", com.itg.devconfig.R.layout.item_developer_checklist_mediation);
      sKeys.put("layout/item_developer_checklist_mediation_header_0", com.itg.devconfig.R.layout.item_developer_checklist_mediation_header);
      sKeys.put("layout/item_developer_checklist_section_0", com.itg.devconfig.R.layout.item_developer_checklist_section);
    }
  }
}
