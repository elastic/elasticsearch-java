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

package co.elastic.clients.elasticsearch.data_recovery;

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

// typedef: data_recovery._types.ResolvedRecoverySource

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery._types.ResolvedRecoverySource">API
 *      specification</a>
 */
@JsonpDeserializable
public class ResolvedRecoverySource implements JsonpSerializable {
	private final String source;

	private final SourceType type;

	private final String destination;

	// ---------------------------------------------------------------------------------------------

	private ResolvedRecoverySource(Builder builder) {

		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.destination = ApiTypeHelper.requireNonNull(builder.destination, this, "destination");

	}

	public static ResolvedRecoverySource of(Function<Builder, ObjectBuilder<ResolvedRecoverySource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the index or data stream in the recovery point.
	 * <p>
	 * API name: {@code source}
	 */
	public final String source() {
		return this.source;
	}

	/**
	 * Required - The type of the source.
	 * <p>
	 * API name: {@code type}
	 */
	public final SourceType type() {
		return this.type;
	}

	/**
	 * Required - The name of the index or data stream that the source is recovered
	 * to.
	 * <p>
	 * API name: {@code destination}
	 */
	public final String destination() {
		return this.destination;
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

		generator.writeKey("source");
		generator.write(this.source);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		generator.writeKey("destination");
		generator.write(this.destination);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResolvedRecoverySource}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ResolvedRecoverySource> {
		private String source;

		private SourceType type;

		private String destination;

		public Builder() {
		}
		private Builder(ResolvedRecoverySource instance) {
			this.source = instance.source;
			this.type = instance.type;
			this.destination = instance.destination;

		}
		/**
		 * Required - The name of the index or data stream in the recovery point.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(String value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - The type of the source.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(SourceType value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - The name of the index or data stream that the source is recovered
		 * to.
		 * <p>
		 * API name: {@code destination}
		 */
		public final Builder destination(String value) {
			this.destination = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ResolvedRecoverySource}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResolvedRecoverySource build() {
			_checkSingleUse();

			return new ResolvedRecoverySource(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResolvedRecoverySource}
	 */
	public static final JsonpDeserializer<ResolvedRecoverySource> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ResolvedRecoverySource::setupResolvedRecoverySourceDeserializer);

	protected static void setupResolvedRecoverySourceDeserializer(
			ObjectDeserializer<ResolvedRecoverySource.Builder> op) {

		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");
		op.add(Builder::type, SourceType._DESERIALIZER, "type");
		op.add(Builder::destination, JsonpDeserializer.stringDeserializer(), "destination");

	}

}
