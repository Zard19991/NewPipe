package org.schabi.newpipe.player.mediaitem;

import org.schabi.newpipe.extractor.stream.StreamInfo;
import org.schabi.newpipe.extractor.stream.StreamType;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class PlaceholderTag implements MediaItemTag {
    public static final PlaceholderTag EMPTY = new PlaceholderTag(null);
    private static final String UNKNOWN_VALUE_INTERNAL = "Placeholder";

    @Nullable
    private final Object extras;

    private PlaceholderTag(@Nullable final Object extras) {
        this.extras = extras;
    }

    @NonNull
    @Override
    public List<Throwable> getErrors() {
        return Collections.emptyList();
    }

    @Override
    public int getServiceId() {
        return -1;
    }

    @Override
    public String getTitle() {
        return UNKNOWN_VALUE_INTERNAL;
    }

    @Override
    public String getUploaderName() {
        return UNKNOWN_VALUE_INTERNAL;
    }

    @Override
    public long getDurationSeconds() {
        return -1;
    }

    @Override
    public String getStreamUrl() {
        return UNKNOWN_VALUE_INTERNAL;
    }

    @Override
    public String getThumbnailUrl() {
        return UNKNOWN_VALUE_INTERNAL;
    }

    @Override
    public String getUploaderUrl() {
        return UNKNOWN_VALUE_INTERNAL;
    }

    @Override
    public StreamType getStreamType() {
        return StreamType.NONE;
    }

    @Override
    public Optional<StreamInfo> getMaybeStreamInfo() {
        return Optional.empty();
    }

    @Override
    public Optional<Quality> getMaybeQuality() {
        return Optional.empty();
    }

    @Override
    public <T> Optional<T> getMaybeExtras(@NonNull final Class<T> type) {
        return Optional.ofNullable(extras).map(type::cast);
    }

    @Override
    public <T> MediaItemTag withExtras(@NonNull final T extra) {
        return new PlaceholderTag(extra);
    }
}
