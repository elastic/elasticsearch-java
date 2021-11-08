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

package co.elastic.clients.elasticsearch.snapshot;

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
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot._types.RepositorySettings
@JsonpDeserializable
public class RepositorySettings implements JsonpSerializable {
	@Nullable
	private final String chunkSize;

	@Nullable
	private final Boolean compress;

	@Nullable
	private final String concurrentStreams;

	private final String location;

	@Nullable
	private final Boolean readOnly;

	// ---------------------------------------------------------------------------------------------

	private RepositorySettings(Builder builder) {

		this.chunkSize = builder.chunkSize;
		this.compress = builder.compress;
		this.concurrentStreams = builder.concurrentStreams;
		this.location = ModelTypeHelper.requireNonNull(builder.location, this, "location");
		this.readOnly = builder.readOnly;

	}

	public static RepositorySettings of(Function<Builder, ObjectBuilder<RepositorySettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code chunk_size}
	 */
	@Nullable
	public final String chunkSize() {
		return this.chunkSize;
	}

	/**
	 * API name: {@code compress}
	 */
	@Nullable
	public final Boolean compress() {
		return this.compress;
	}

	/**
	 * API name: {@code concurrent_streams}
	 */
	@Nullable
	public final String concurrentStreams() {
		return this.concurrentStreams;
	}

	/**
	 * Required - API name: {@code location}
	 */
	public final String location() {
		return this.location;
	}

	/**
	 * API name: {@code read_only}
	 */
	@Nullable
	public final Boolean readOnly() {
		return this.readOnly;
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

		if (this.chunkSize != null) {
			generator.writeKey("chunk_size");
			generator.write(this.chunkSize);

		}
		if (this.compress != null) {
			generator.writeKey("compress");
			generator.write(this.compress);

		}
		if (this.concurrentStreams != null) {
			generator.writeKey("concurrent_streams");
			generator.write(this.concurrentStreams);

		}
		generator.writeKey("location");
		generator.write(this.location);

		if (this.readOnly != null) {
			generator.writeKey("read_only");
			generator.write(this.readOnly);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositorySettings}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RepositorySettings> {
		@Nullable
		private String chunkSize;

		@Nullable
		private Boolean compress;

		@Nullable
		private String concurrentStreams;

		private String location;

		@Nullable
		private Boolean readOnly;

		/**
		 * API name: {@code chunk_size}
		 */
		public final Builder chunkSize(@Nullable String value) {
			this.chunkSize = value;
			return this;
		}

		/**
		 * API name: {@code compress}
		 */
		public final Builder compress(@Nullable Boolean value) {
			this.compress = value;
			return this;
		}

		/**
		 * API name: {@code concurrent_streams}
		 */
		public final Builder concurrentStreams(@Nullable String value) {
			this.concurrentStreams = value;
			return this;
		}

		/**
		 * Required - API name: {@code location}
		 */
		public final Builder location(String value) {
			this.location = value;
			return this;
		}

		/**
		 * API name: {@code read_only}
		 */
		public final Builder readOnly(@Nullable Boolean value) {
			this.readOnly = value;
			return this;
		}

		/**
		 * Builds a {@link RepositorySettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositorySettings build() {
			_checkSingleUse();

			return new RepositorySettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RepositorySettings}
	 */
	public static final JsonpDeserializer<RepositorySettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RepositorySettings::setupRepositorySettingsDeserializer, Builder::build);

	protected static void setupRepositorySettingsDeserializer(DelegatingDeserializer<RepositorySettings.Builder> op) {

		op.add(Builder::chunkSize, JsonpDeserializer.stringDeserializer(), "chunk_size");
		op.add(Builder::compress, JsonpDeserializer.booleanDeserializer(), "compress");
		op.add(Builder::concurrentStreams, JsonpDeserializer.stringDeserializer(), "concurrent_streams");
		op.add(Builder::location, JsonpDeserializer.stringDeserializer(), "location");
		op.add(Builder::readOnly, JsonpDeserializer.booleanDeserializer(), "read_only", "readonly");

	}

}
