package com.daaj.notekeeper;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import java.security.PublicKey;

public class NoteActivityViewModel extends ViewModel {

     public static final String ORIGINAL_NOTE_COURSE_ID= "com.daaj.notekeeper.ORIGINAL_NOTE_COURSE_ID";
     public static final String ORIGINAL_NOTE_TITLE = "com.daaj.notekeeper.ORIGINAL_NOTE_TITLE";
     public static final String ORIGINAL_NOTE_TEXT = "com.daaj.notekeeper.ORIGINAL_NOTE_TEXT";
     public static final String ORIGINAL_NOTE_POSITION ="com.daaj.notekeeper.ORIGINAL_NOTE_POSITION";


     public String mOriginalNoteCourseId;
     public String mOriginalNoteTitle;
     public String mOriginalNoteText;
     public Integer mOriginalNotePosition;

     public boolean mIsNewlyCreated = true;

     public void saveState(Bundle outState) {

          outState.putString(ORIGINAL_NOTE_COURSE_ID,mOriginalNoteCourseId);
          outState.putString(ORIGINAL_NOTE_TITLE,mOriginalNoteTitle);
          outState.putString(ORIGINAL_NOTE_TEXT,mOriginalNoteText);
          outState.putInt(ORIGINAL_NOTE_POSITION, mOriginalNotePosition);

     }

     public void restoreState(Bundle inState){

          mOriginalNoteCourseId = inState.getString(ORIGINAL_NOTE_COURSE_ID);
          mOriginalNoteTitle = inState.getString(ORIGINAL_NOTE_TITLE);
          mOriginalNoteText = inState.getString(mOriginalNoteText);
          mOriginalNotePosition = inState.getInt(ORIGINAL_NOTE_POSITION);

     }
}


