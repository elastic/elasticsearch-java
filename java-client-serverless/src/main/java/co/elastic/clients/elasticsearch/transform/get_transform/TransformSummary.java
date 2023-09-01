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

package co.elastic.clients.elasticsearch.transform.get_transform;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.core.reindex.Destination;
import co.elastic.clients.elasticsearch.ml.TransformAuthorization;
import co.elastic.clients.elasticsearch.transform.Latest;
import co.elastic.clients.elasticsearch.transform.Pivot;
import co.elastic.clients.elasticsearch.transform.RetentionPolicy;
import co.elastic.clients.elasticsearch.transform.Settings;
import co.elastic.clients.elasticsearch.transform.Source;
import co.elastic.clients.elasticsearch.transform.Sync;
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

// typedef: transform.get_transform.TransformSummary

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_transform.TransformSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformSummary implements JsonpSerializable {
	@Nullable
	private final TransformAuthorization authorization;

	@Nullable
	private final Long createTime;

	@Nullable
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

	@Nullable
	private final Settings settings;

	private final Source source;

	@Nullable
	private final Sync sync;

	@Nullable
	private final String version;

	private final Map<String, JsonData> meta;

	// ---------------------------------------------------------------------------------------------

	private TransformSummary(Builder builder) {

		this.authorization = builder.authorization;
		this.createTime = builder.createTime;
		this.description = builder.description;
		this.dest = ApiTypeHelper.requireNonNull(builder.dest, this, "dest");
		this.frequency = builder.frequency;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.latest = builder.latest;
		this.pivot = builder.pivot;
		this.retentionPolicy = builder.retentionPolicy;
		this.settings = builder.settings;
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.sync = builder.sync;
		this.version = builder.version;
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);

	}

	public static TransformSummary of(Function<Builder, ObjectBuilder<TransformSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The security privileges that the transform uses to run its queries. If
	 * Elastic Stack security features were disabled at the time of the most recent
	 * update to the transform, this property is omitted.
	 * <p>
	 * API name: {@code authorization}
	 */
	@Nullable
	public final TransformAuthorization authorization() {
		return this.authorization;
	}

	/**
	 * The time the transform was created.
	 * <p>
	 * API name: {@code create_time}
	 */
	@Nullable
	public final Long createTime() {
		return this.createTime;
	}

	/**
	 * Free text description of the transform.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - The destination for the transform.
	 * <p>
	 * API name: {@code dest}
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
	 * The pivot method transforms the data by aggregating and grouping it.
	 * <p>
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
	 * Defines optional transform settings.
	 * <p>
	 * API name: {@code settings}
	 */
	@Nullable
	public final Settings settings() {
		return this.settings;
	}

	/**
	 * Required - The source of the data for the transform.
	 * <p>
	 * API name: {@code source}
	 */
	public final Source source() {
		return this.source;
	}

	/**
	 * Defines the properties transforms require to run continuously.
	 * <p>
	 * API name: {@code sync}
	 */
	@Nullable
	public final Sync sync() {
		return this.sync;
	}

	/**
	 * The version of Elasticsearch that existed on the node when the transform was
	 * created.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
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
		if (this.createTime != null) {
			generator.writeKey("create_time");
			generator.write(this.createTime);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
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
		if (this.settings != null) {
			generator.writeKey("settings");
			this.settings.serialize(generator, mapper);

		}
		generator.writeKey("source");
		this.source.serialize(generator, mapper);

		if (this.sync != null) {
			generator.writeKey("sync");
			this.sync.serialize(generator, mapper);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
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
	 * Builder for {@link TransformSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TransformSummary> {
		@Nullable
		private TransformAuthorization authorization;

		@Nullable
		private Long createTime;

		@Nullable
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

		@Nullable
		private Settings settings;

		private Source source;

		@Nullable
		private Sync sync;

		@Nullable
		private String version;

		@Nullable
		private Map<String, JsonData> meta;

		/**
		 * The security privileges that the transform uses to run its queries. If
		 * Elastic Stack security features were disabled at the time of the most recent
		 * update to the transform, this property is omitted.
		 * <p>
		 * API name: {@code authorization}
		 */
		public final Builder authorization(@Nullable TransformAuthorization value) {
			this.authorization = value;
			return this;
		}

		/**
		 * The security privileges that the transform uses to run its queries. If
		 * Elastic Stack security features were disabled at the time of the most recent
		 * update to the transform, this property is omitted.
		 * <p>
		 * API name: {@code authorization}
		 */
		public final Builder authorization(
				Function<TransformAuthorization.Builder, ObjectBuilder<TransformAuthorization>> fn) {
			return this.authorization(fn.apply(new TransformAuthorization.Builder()).build());
		}

		/**
		 * The time the transform was created.
		 * <p>
		 * API name: {@code create_time}
		 */
		public final Builder createTime(@Nullable Long value) {
			this.createTime = value;
			return this;
		}

		/**
		 * Free text description of the transform.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - The destination for the transform.
		 * <p>
		 * API name: {@code dest}
		 */
		public final Builder dest(Destination value) {
			this.dest = value;
			return this;
		}

		/**
		 * Required - The destination for the transform.
		 * <p>
		 * API name: {@code dest}
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
		 * The pivot method transforms the data by aggregating and grouping it.
		 * <p>
		 * API name: {@code pivot}
		 */
		public final Builder pivot(@Nullable Pivot value) {
			this.pivot = value;
			return this;
		}

		/**
		 * The pivot method transforms the data by aggregating and grouping it.
		 * <p>
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
		 * Defines optional transform settings.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(@Nullable Settings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Defines optional transform settings.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(Function<Settings.Builder, ObjectBuilder<Settings>> fn) {
			return this.settings(fn.apply(new Settings.Builder()).build());
		}

		/**
		 * Required - The source of the data for the transform.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(Source value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - The source of the data for the transform.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(Function<Source.Builder, ObjectBuilder<Source>> fn) {
			return this.source(fn.apply(new Source.Builder()).build());
		}

		/**
		 * Defines the properties transforms require to run continuously.
		 * <p>
		 * API name: {@code sync}
		 */
		public final Builder sync(@Nullable Sync value) {
			this.sync = value;
			return this;
		}

		/**
		 * Defines the properties transforms require to run continuously.
		 * <p>
		 * API name: {@code sync}
		 */
		public final Builder sync(Function<Sync.Builder, ObjectBuilder<Sync>> fn) {
			return this.sync(fn.apply(new Sync.Builder()).build());
		}

		/**
		 * The version of Elasticsearch that existed on the node when the transform was
		 * created.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
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
		 * Builds a {@link TransformSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformSummary build() {
			_checkSingleUse();

			return new TransformSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransformSummary}
	 */
	public static final JsonpDeserializer<TransformSummary> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TransformSummary::setupTransformSummaryDeserializer);

	protected static void setupTransformSummaryDeserializer(ObjectDeserializer<TransformSummary.Builder> op) {

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
