package com.example.noteapp.ui.detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\'2\u0006\u0010(\u001a\u00020\tH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R/\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u00178F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u0006+"}, d2 = {"Lcom/example/noteapp/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/noteapp/repository/NoteRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/noteapp/repository/NoteRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/example/noteapp/util/UiEvent;", "<set-?>", "", "date", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "date$delegate", "Landroidx/compose/runtime/MutableState;", "description", "getDescription", "setDescription", "description$delegate", "Lcom/example/noteapp/model/Note;", "note", "getNote", "()Lcom/example/noteapp/model/Note;", "setNote", "(Lcom/example/noteapp/model/Note;)V", "note$delegate", "title", "getTitle", "setTitle", "title$delegate", "uiEvent", "Lkotlinx/coroutines/flow/Flow;", "getUiEvent", "()Lkotlinx/coroutines/flow/Flow;", "onEvent", "", "event", "Lcom/example/noteapp/ui/detail/DetailEvent;", "sendUiEvent", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.noteapp.repository.NoteRepository repository = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.compose.runtime.MutableState note$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState title$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState description$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState date$delegate = null;
    private final kotlinx.coroutines.channels.Channel<com.example.noteapp.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.noteapp.util.UiEvent> uiEvent = null;
    
    @javax.inject.Inject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.noteapp.repository.NoteRepository repository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.noteapp.model.Note getNote() {
        return null;
    }
    
    private final void setNote(com.example.noteapp.model.Note p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    private final void setTitle(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    private final void setDescription(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    private final void setDate(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.noteapp.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.example.noteapp.ui.detail.DetailEvent event) {
    }
    
    private final void sendUiEvent(com.example.noteapp.util.UiEvent event) {
    }
}