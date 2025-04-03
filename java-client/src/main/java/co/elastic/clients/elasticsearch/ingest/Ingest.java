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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ingest._types.Ingest

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.Ingest">API
 *      specification</a>
 */
@JsonpDeserializable
public class Ingest implements JsonpSerializable {
	@Nullable
	private final Redact redact;

	private final DateTime timestamp;

	@Nullable
	private final String pipeline;

	// ---------------------------------------------------------------------------------------------

	private Ingest(Builder builder) {

		this.redact = builder.redact;
		this.timestamp = ApiTypeHelper.requireNonNullWithDefault(builder.timestamp, this, "timestamp",
				this.timestamp());
		this.pipeline = builder.pipeline;

	}

	public static Ingest of(Function<Builder, ObjectBuilder<Ingest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code _redact}
	 */
	@Nullable
	public final Redact redact() {
		return this.redact;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final DateTime timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
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

		if (this.redact != null) {
			generator.writeKey("_redact");
			this.redact.serialize(generator, mapper);

		}
		generator.writeKey("timestamp");
		this.timestamp.serialize(generator, mapper);
		if (this.pipeline != null) {
			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ingest}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Ingest> {
		@Nullable
		private Redact redact;

		private DateTime timestamp;

		@Nullable
		private String pipeline;

		/**
		 * API name: {@code _redact}
		 */
		public final Builder redact(@Nullable Redact value) {
			this.redact = value;
			return this;
		}

		/**
		 * API name: {@code _redact}
		 */
		public final Builder redact(Function<Redact.Builder, ObjectBuilder<Redact>> fn) {
			return this.redact(fn.apply(new Redact.Builder()).build());
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(DateTime value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Ingest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ingest build() {
			_checkSingleUse();

			return new Ingest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Ingest}
	 */
	public static final JsonpDeserializer<Ingest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Ingest::setupIngestDeserializer);

	protected static void setupIngestDeserializer(ObjectDeserializer<Ingest.Builder> op) {

		op.add(Builder::redact, Redact._DESERIALIZER, "_redact");
		op.add(Builder::timestamp, DateTime._DESERIALIZER, "timestamp");
		op.add(Builder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");

	}

}
