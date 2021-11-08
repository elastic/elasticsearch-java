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

import co.elastic.clients.elasticsearch.core.reindex.Destination;
import co.elastic.clients.elasticsearch.core.reindex.Source;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.update_transform.Response
@JsonpDeserializable
public class UpdateTransformResponse implements JsonpSerializable {
	private final long createTime;

	private final String description;

	private final Destination dest;

	private final String frequency;

	private final String id;

	private final Pivot pivot;

	private final Settings settings;

	private final Source source;

	@Nullable
	private final Sync sync;

	private final String version;

	// ---------------------------------------------------------------------------------------------

	private UpdateTransformResponse(Builder builder) {

		this.createTime = ModelTypeHelper.requireNonNull(builder.createTime, this, "createTime");
		this.description = ModelTypeHelper.requireNonNull(builder.description, this, "description");
		this.dest = ModelTypeHelper.requireNonNull(builder.dest, this, "dest");
		this.frequency = ModelTypeHelper.requireNonNull(builder.frequency, this, "frequency");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.pivot = ModelTypeHelper.requireNonNull(builder.pivot, this, "pivot");
		this.settings = ModelTypeHelper.requireNonNull(builder.settings, this, "settings");
		this.source = ModelTypeHelper.requireNonNull(builder.source, this, "source");
		this.sync = builder.sync;
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static UpdateTransformResponse of(Function<Builder, ObjectBuilder<UpdateTransformResponse>> fn) {
		return fn.apply(new Builder()).build();
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
	 * Required - API name: {@code frequency}
	 */
	public final String frequency() {
		return this.frequency;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code pivot}
	 */
	public final Pivot pivot() {
		return this.pivot;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("create_time");
		generator.write(this.createTime);

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("dest");
		this.dest.serialize(generator, mapper);

		generator.writeKey("frequency");
		generator.write(this.frequency);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("pivot");
		this.pivot.serialize(generator, mapper);

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateTransformResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<UpdateTransformResponse> {
		private Long createTime;

		private String description;

		private Destination dest;

		private String frequency;

		private String id;

		private Pivot pivot;

		private Settings settings;

		private Source source;

		@Nullable
		private Sync sync;

		private String version;

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
		 * Required - API name: {@code frequency}
		 */
		public final Builder frequency(String value) {
			this.frequency = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code pivot}
		 */
		public final Builder pivot(Pivot value) {
			this.pivot = value;
			return this;
		}

		/**
		 * Required - API name: {@code pivot}
		 */
		public final Builder pivot(Function<Pivot.Builder, ObjectBuilder<Pivot>> fn) {
			return this.pivot(fn.apply(new Pivot.Builder()).build());
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
			.lazy(Builder::new, UpdateTransformResponse::setupUpdateTransformResponseDeserializer, Builder::build);

	protected static void setupUpdateTransformResponseDeserializer(
			DelegatingDeserializer<UpdateTransformResponse.Builder> op) {

		op.add(Builder::createTime, JsonpDeserializer.longDeserializer(), "create_time");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::dest, Destination._DESERIALIZER, "dest");
		op.add(Builder::frequency, JsonpDeserializer.stringDeserializer(), "frequency");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::pivot, Pivot._DESERIALIZER, "pivot");
		op.add(Builder::settings, Settings._DESERIALIZER, "settings");
		op.add(Builder::source, Source._DESERIALIZER, "source");
		op.add(Builder::sync, Sync._DESERIALIZER, "sync");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
