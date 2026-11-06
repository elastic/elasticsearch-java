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

package co.elastic.clients.elasticsearch.data_recovery.start_recovery;

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

// typedef: data_recovery.start_recovery.RenameStrategy

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#data_recovery.start_recovery.RenameStrategy">API
 *      specification</a>
 */
@JsonpDeserializable
public class RenameStrategy implements JsonpSerializable {
	@Nullable
	private final String prefix;

	@Nullable
	private final String suffix;

	// ---------------------------------------------------------------------------------------------

	private RenameStrategy(Builder builder) {

		this.prefix = builder.prefix;
		this.suffix = builder.suffix;

	}

	public static RenameStrategy of(Function<Builder, ObjectBuilder<RenameStrategy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Text to add at the start of the name of each recovered source. At least one
	 * of <code>prefix</code> and <code>suffix</code> must be set to a non-empty
	 * value, and both can be set together.
	 * <p>
	 * API name: {@code prefix}
	 */
	@Nullable
	public final String prefix() {
		return this.prefix;
	}

	/**
	 * Text to add at the end of the name of each recovered source. At least one of
	 * <code>prefix</code> and <code>suffix</code> must be set to a non-empty value,
	 * and both can be set together.
	 * <p>
	 * API name: {@code suffix}
	 */
	@Nullable
	public final String suffix() {
		return this.suffix;
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

		if (this.prefix != null) {
			generator.writeKey("prefix");
			generator.write(this.prefix);

		}
		if (this.suffix != null) {
			generator.writeKey("suffix");
			generator.write(this.suffix);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RenameStrategy}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RenameStrategy> {
		@Nullable
		private String prefix;

		@Nullable
		private String suffix;

		public Builder() {
		}
		private Builder(RenameStrategy instance) {
			this.prefix = instance.prefix;
			this.suffix = instance.suffix;

		}
		/**
		 * Text to add at the start of the name of each recovered source. At least one
		 * of <code>prefix</code> and <code>suffix</code> must be set to a non-empty
		 * value, and both can be set together.
		 * <p>
		 * API name: {@code prefix}
		 */
		public final Builder prefix(@Nullable String value) {
			this.prefix = value;
			return this;
		}

		/**
		 * Text to add at the end of the name of each recovered source. At least one of
		 * <code>prefix</code> and <code>suffix</code> must be set to a non-empty value,
		 * and both can be set together.
		 * <p>
		 * API name: {@code suffix}
		 */
		public final Builder suffix(@Nullable String value) {
			this.suffix = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RenameStrategy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RenameStrategy build() {
			_checkSingleUse();

			return new RenameStrategy(this);
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
	 * Json deserializer for {@link RenameStrategy}
	 */
	public static final JsonpDeserializer<RenameStrategy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RenameStrategy::setupRenameStrategyDeserializer);

	protected static void setupRenameStrategyDeserializer(ObjectDeserializer<RenameStrategy.Builder> op) {

		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::suffix, JsonpDeserializer.stringDeserializer(), "suffix");

	}

}
