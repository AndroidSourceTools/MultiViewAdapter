/*
 * Copyright 2017 Riyaz Ahamed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.ahamed.mva.sample.view.expansion;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import mva2.adapter.MultiViewAdapter;
import mva2.adapter.decorator.Decorator;

import static dev.ahamed.mva.sample.view.SampleActivity.DP_EIGHT;

public class SectionSpaceDecorator extends Decorator {

  public SectionSpaceDecorator(MultiViewAdapter adapter) {
    super(adapter);
  }

  @Override public void getItemOffsets(@NonNull Rect outRect, @NonNull View view,
      @NonNull RecyclerView parent, @NonNull RecyclerView.State state, int adapterPosition) {
    if (isFirst(getPositionType(adapterPosition, parent))) {
      addToRect(outRect, 0, DP_EIGHT * 2, 0, 0);
    }
    addToRect(outRect, 0, 0, 0, 1);
  }
}