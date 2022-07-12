/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.core.reindex.Destination;
import co.elastic.clients.elasticsearch.core.reindex.Source;
import co.elastic.clients.elasticsearch.ml.TransformAuthorization;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.update_transform.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#transform.update_transform.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateTransformResponse implements JsonpSerializable {
	@Nullable
	private final TransformAuthorization authorization;

	private final long createTime;

	private final String description;

	private final Destination dest;

	@Nullable
	private final Time frequency;

	private final String id;

	@Nullable
	private final Latest latest;

	@Nullable
	private final Pivot pivot;

	@Nullable
	private final RetentionPolicy retentionPolicy;

	private final Settings settings;

	private final Source source;

	@Nullable
	private final Sync sync;

	private final String version;

	private final Map<String, JsonData> meta;

	// ---------------------------------------------------------------------------------------------

	private UpdateTransformResponse(Builder builder) {

		this.authorization = builder.authorization;
		this.createTime = ApiTypeHelper.requireNonNull(builder.createTime, this, "createTime");
		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.dest = ApiTypeHelper.requireNonNull(builder.dest, this, "dest");
		this.frequency = builder.frequency;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.latest = builder.latest;
		this.pivot = builder.pivot;
		this.retentionPolicy = builder.retentionPolicy;
		this.settings = ApiTypeHelper.requireNonNull(builder.settings, this, "settings");
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.sync = builder.sync;
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);

	}

	public static UpdateTransformResponse of(Function<Builder, ObjectBuilder<UpdateTransformResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code authorization}
	 */
	@Nullable
	public final TransformAuthorization authorization() {
		return this.authorization;
	}

	/**
	 * Required - API name: {@code create_time}
	 */
	public final long createTime() {
		return this.createTime;
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code dest}
	 */
	public final Destination dest() {
		return this.dest;
	}

	/**
	 * API name: {@code frequency}
	 */
	@Nullable
	public final Time frequency() {
		return this.frequency;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code latest}
	 */
	@Nullable
	public final Latest latest() {
		return this.latest;
	}

	/**
	 * API name: {@code pivot}
	 */
	@Nullable
	public final Pivot pivot() {
		return this.pivot;
	}

	/**
	 * API name: {@code retention_policy}
	 */
	@Nullable
	public final RetentionPolicy retentionPolicy() {
		return this.retentionPolicy;
	}

	/**
	 * Required - API name: {@code settings}
	 */
	public final Settings settings() {
		return this.settings;
	}

	/**
	 * Required - API name: {@code source}
	 */
	public final Source source() {
		return this.source;
	}

	/**
	 * API name: {@code sync}
	 */
	@Nullable
	public final Sync sync() {
		return this.sync;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final String version() {
		return this.version;
	}

	/**
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.authorization != null) {
			generator.writeKey("authorization");
			this.authorization.serialize(generator, mapper);

		}
		generator.writeKey("create_time");
		generator.write(this.createTime);

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("dest");
		this.dest.serialize(generator, mapper);

		if (this.frequency != null) {
			generator.writeKey("frequency");
			this.frequency.serialize(generator, mapper);

		}
		generator.writeKey("id");
		generator.write(this.id);

		if (this.latest != null) {
			generator.writeKey("latest");
			this.latest.serialize(generator, mapper);

		}
		if (this.pivot != null) {
			generator.writeKey("pivot");
			this.pivot.serialize(generator, mapper);

		}
		if (this.retentionPolicy != null) {
			generator.writeKey("retention_policy");
			this.retentionPolicy.serialize(generator, mapper);

		}
		generator.writeKey("settings");
		this.settings.serialize(generator, mapper);

		generator.writeKey("source");
		this.source.serialize(generator, mapper);

		if (this.sync != null) {
			generator.writeKey("sync");
			this.sync.serialize(generator, mapper);

		}
		generator.writeKey("version");
		generator.write(this.version);

		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateTransformResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<UpdateTransformResponse> {
		@Nullable
		private TransformAuthorization authorization;

		private Long createTime;

		private String description;

		private Destination dest;

		@Nullable
		private Time frequency;

		private String id;

		@Nullable
		private Latest latest;

		@Nullable
		private Pivot pivot;

		@Nullable
		private RetentionPolicy retentionPolicy;

		private Settings settings;

		private Source source;

		@Nullable
		private Sync sync;

		private String version;

		@Nullable
		private Map<String, JsonData> meta;

		/**
		 * API name: {@code authorization}
		 */
		public final Builder authorization(@Nullable TransformAuthorization value) {
			this.authorization = value;
			return this;
		}

		/**
		 * API name: {@code authorization}
		 */
		public final Builder authorization(
				Function<TransformAuthorization.Builder, ObjectBuilder<TransformAuthorization>> fn) {
			return this.authorization(fn.apply(new TransformAuthorization.Builder()).build());
		}

		/**
		 * Required - API name: {@code create_time}
		 */
		public final Builder createTime(long value) {
			this.createTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code dest}
		 */
		public final Builder dest(Destination value) {
			this.dest = value;
			return this;
		}

		/**
		 * Required - API name: {@code dest}
		 */
		public final Builder dest(Function<Destination.Builder, ObjectBuilder<Destination>> fn) {
			return this.dest(fn.apply(new Destination.Builder()).build());
		}

		/**
		 * API name: {@code frequency}
		 */
		public final Builder frequency(@Nullable Time value) {
			this.frequency = value;
			return this;
		}

		/**
		 * API name: {@code frequency}
		 */
		public final Builder frequency(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.frequency(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code latest}
		 */
		public final Builder latest(@Nullable Latest value) {
			this.latest = value;
			return this;
		}

		/**
		 * API name: {@code latest}
		 */
		public final Builder latest(Function<Latest.Builder, ObjectBuilder<Latest>> fn) {
			return this.latest(fn.apply(new Latest.Builder()).build());
		}

		/**
		 * API name: {@code pivot}
		 */
		public final Builder pivot(@Nullable Pivot value) {
			this.pivot = value;
			return this;
		}

		/**
		 * API name: {@code pivot}
		 */
		public final Builder pivot(Function<Pivot.Builder, ObjectBuilder<Pivot>> fn) {
			return this.pivot(fn.apply(new Pivot.Builder()).build());
		}

		/**
		 * API name: {@code retention_policy}
		 */
		public final Builder retentionPolicy(@Nullable RetentionPolicy value) {
			this.retentionPolicy = value;
			return this;
		}

		/**
		 * API name: {@code retention_policy}
		 */
		public final Builder retentionPolicy(Function<RetentionPolicy.Builder, ObjectBuilder<RetentionPolicy>> fn) {
			return this.retentionPolicy(fn.apply(new RetentionPolicy.Builder()).build());
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(Settings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(Function<Settings.Builder, ObjectBuilder<Settings>> fn) {
			return this.settings(fn.apply(new Settings.Builder()).build());
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(Source value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(Function<Source.Builder, ObjectBuilder<Source>> fn) {
			return this.source(fn.apply(new Source.Builder()).build());
		}

		/**
		 * API name: {@code sync}
		 */
		public final Builder sync(@Nullable Sync value) {
			this.sync = value;
			return this;
		}

		/**
		 * API name: {@code sync}
		 */
		public final Builder sync(Function<Sync.Builder, ObjectBuilder<Sync>> fn) {
			return this.sync(fn.apply(new Sync.Builder()).build());
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateTransformResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateTransformResponse build() {
			_checkSingleUse();

			return new UpdateTransformResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateTransformResponse}
	 */
	public static final JsonpDeserializer<UpdateTransformResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateTransformResponse::setupUpdateTransformResponseDeserializer);

	protected static void setupUpdateTransformResponseDeserializer(
			ObjectDeserializer<UpdateTransformResponse.Builder> op) {

		op.add(Builder::authorization, TransformAuthorization._DESERIALIZER, "authorization");
		op.add(Builder::createTime, JsonpDeserializer.longDeserializer(), "create_time");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::dest, Destination._DESERIALIZER, "dest");
		op.add(Builder::frequency, Time._DESERIALIZER, "frequency");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::latest, Latest._DESERIALIZER, "latest");
		op.add(Builder::pivot, Pivot._DESERIALIZER, "pivot");
		op.add(Builder::retentionPolicy, RetentionPolicy._DESERIALIZER, "retention_policy");
		op.add(Builder::settings, Settings._DESERIALIZER, "settings");
		op.add(Builder::source, Source._DESERIALIZER, "source");
		op.add(Builder::sync, Sync._DESERIALIZER, "sync");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");

	}

}
