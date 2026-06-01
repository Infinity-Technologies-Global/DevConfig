package com.itg.devconfig.databinding;
import com.itg.devconfig.R;
import com.itg.devconfig.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogAdminOrganicAdsBindingImpl extends DialogAdminOrganicAdsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardDialog, 1);
        sViewsWithIds.put(R.id.viewAccent, 2);
        sViewsWithIds.put(R.id.imvIcon, 3);
        sViewsWithIds.put(R.id.tvTitle, 4);
        sViewsWithIds.put(R.id.tvSubtitle, 5);
        sViewsWithIds.put(R.id.layoutSwitchRow, 6);
        sViewsWithIds.put(R.id.tvUnlimitedAdsLabel, 7);
        sViewsWithIds.put(R.id.tvUnlimitedAdsHint, 8);
        sViewsWithIds.put(R.id.switchUnlimitedAds, 9);
        sViewsWithIds.put(R.id.divider, 10);
        sViewsWithIds.put(R.id.btnChecklist, 11);
        sViewsWithIds.put(R.id.btnApply, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogAdminOrganicAdsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private DialogAdminOrganicAdsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (android.view.View) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.Switch) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}