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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
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

// typedef: nodes._types.TransportHistogram

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.TransportHistogram">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransportHistogram implements JsonpSerializable {
	@Nullable
	private final Long count;

	@Nullable
	private final Long ltMillis;

	@Nullable
	private final Long geMillis;

	// ---------------------------------------------------------------------------------------------

	private TransportHistogram(Builder builder) {

		this.count = builder.count;
		this.ltMillis = builder.ltMillis;
		this.geMillis = builder.geMillis;

	}

	public static TransportHistogram of(Function<Builder, ObjectBuilder<TransportHistogram>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of times a transport thread took a period of time within the
	 * bounds of this bucket to handle an inbound message.
	 * <p>
	 * API name: {@code count}
	 */
	@Nullable
	public final Long count() {
		return this.count;
	}

	/**
	 * The exclusive upper bound of the bucket in milliseconds. May be omitted on
	 * the last bucket if this bucket has no upper bound.
	 * <p>
	 * API name: {@code lt_millis}
	 */
	@Nullable
	public final Long ltMillis() {
		return this.ltMillis;
	}

	/**
	 * The inclusive lower bound of the bucket in milliseconds. May be omitted on
	 * the first bucket if this bucket has no lower bound.
	 * <p>
	 * API name: {@code ge_millis}
	 */
	@Nullable
	public final Long geMillis() {
		return this.geMillis;
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

		if (this.count != null) {
			generator.writeKey("count");
			generator.write(this.count);

		}
		if (this.ltMillis != null) {
			generator.writeKey("lt_millis");
			generator.write(this.ltMillis);

		}
		if (this.geMillis != null) {
			generator.writeKey("ge_millis");
			generator.write(this.geMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransportHistogram}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TransportHistogram> {
		@Nullable
		private Long count;

		@Nullable
		private Long ltMillis;

		@Nullable
		private Long geMillis;

		/**
		 * The number of times a transport thread took a period of time within the
		 * bounds of this bucket to handle an inbound message.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(@Nullable Long value) {
			this.count = value;
			return this;
		}

		/**
		 * The exclusive upper bound of the bucket in milliseconds. May be omitted on
		 * the last bucket if this bucket has no upper bound.
		 * <p>
		 * API name: {@code lt_millis}
		 */
		public final Builder ltMillis(@Nullable Long value) {
			this.ltMillis = value;
			return this;
		}

		/**
		 * The inclusive lower bound of the bucket in milliseconds. May be omitted on
		 * the first bucket if this bucket has no lower bound.
		 * <p>
		 * API name: {@code ge_millis}
		 */
		public final Builder geMillis(@Nullable Long value) {
			this.geMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransportHistogram}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransportHistogram build() {
			_checkSingleUse();

			return new TransportHistogram(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransportHistogram}
	 */
	public static final JsonpDeserializer<TransportHistogram> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransportHistogram::setupTransportHistogramDeserializer);

	protected static void setupTransportHistogramDeserializer(ObjectDeserializer<TransportHistogram.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::ltMillis, JsonpDeserializer.longDeserializer(), "lt_millis");
		op.add(Builder::geMillis, JsonpDeserializer.longDeserializer(), "ge_millis");

	}

}
