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
import co.elastic.clients.util.ApiTypeHelper;
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

// typedef: nodes._types.SizeHttpHistogram

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.SizeHttpHistogram">API
 *      specification</a>
 */
@JsonpDeserializable
public class SizeHttpHistogram implements JsonpSerializable {
	private final long count;

	@Nullable
	private final Long geBytes;

	@Nullable
	private final Long ltBytes;

	// ---------------------------------------------------------------------------------------------

	private SizeHttpHistogram(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.geBytes = builder.geBytes;
		this.ltBytes = builder.ltBytes;

	}

	public static SizeHttpHistogram of(Function<Builder, ObjectBuilder<SizeHttpHistogram>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * API name: {@code ge_bytes}
	 */
	@Nullable
	public final Long geBytes() {
		return this.geBytes;
	}

	/**
	 * API name: {@code lt_bytes}
	 */
	@Nullable
	public final Long ltBytes() {
		return this.ltBytes;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (this.geBytes != null) {
			generator.writeKey("ge_bytes");
			generator.write(this.geBytes);

		}
		if (this.ltBytes != null) {
			generator.writeKey("lt_bytes");
			generator.write(this.ltBytes);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SizeHttpHistogram}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SizeHttpHistogram> {
		private Long count;

		@Nullable
		private Long geBytes;

		@Nullable
		private Long ltBytes;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code ge_bytes}
		 */
		public final Builder geBytes(@Nullable Long value) {
			this.geBytes = value;
			return this;
		}

		/**
		 * API name: {@code lt_bytes}
		 */
		public final Builder ltBytes(@Nullable Long value) {
			this.ltBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SizeHttpHistogram}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SizeHttpHistogram build() {
			_checkSingleUse();

			return new SizeHttpHistogram(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SizeHttpHistogram}
	 */
	public static final JsonpDeserializer<SizeHttpHistogram> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SizeHttpHistogram::setupSizeHttpHistogramDeserializer);

	protected static void setupSizeHttpHistogramDeserializer(ObjectDeserializer<SizeHttpHistogram.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::geBytes, JsonpDeserializer.longDeserializer(), "ge_bytes");
		op.add(Builder::ltBytes, JsonpDeserializer.longDeserializer(), "lt_bytes");

	}

}
