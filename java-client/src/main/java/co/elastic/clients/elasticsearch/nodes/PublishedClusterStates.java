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

// typedef: nodes._types.PublishedClusterStates

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes._types.PublishedClusterStates">API
 *      specification</a>
 */
@JsonpDeserializable
public class PublishedClusterStates implements JsonpSerializable {
	@Nullable
	private final Long fullStates;

	@Nullable
	private final Long incompatibleDiffs;

	@Nullable
	private final Long compatibleDiffs;

	// ---------------------------------------------------------------------------------------------

	private PublishedClusterStates(Builder builder) {

		this.fullStates = builder.fullStates;
		this.incompatibleDiffs = builder.incompatibleDiffs;
		this.compatibleDiffs = builder.compatibleDiffs;

	}

	public static PublishedClusterStates of(Function<Builder, ObjectBuilder<PublishedClusterStates>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Number of published cluster states.
	 * <p>
	 * API name: {@code full_states}
	 */
	@Nullable
	public final Long fullStates() {
		return this.fullStates;
	}

	/**
	 * Number of incompatible differences between published cluster states.
	 * <p>
	 * API name: {@code incompatible_diffs}
	 */
	@Nullable
	public final Long incompatibleDiffs() {
		return this.incompatibleDiffs;
	}

	/**
	 * Number of compatible differences between published cluster states.
	 * <p>
	 * API name: {@code compatible_diffs}
	 */
	@Nullable
	public final Long compatibleDiffs() {
		return this.compatibleDiffs;
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

		if (this.fullStates != null) {
			generator.writeKey("full_states");
			generator.write(this.fullStates);

		}
		if (this.incompatibleDiffs != null) {
			generator.writeKey("incompatible_diffs");
			generator.write(this.incompatibleDiffs);

		}
		if (this.compatibleDiffs != null) {
			generator.writeKey("compatible_diffs");
			generator.write(this.compatibleDiffs);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PublishedClusterStates}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PublishedClusterStates> {
		@Nullable
		private Long fullStates;

		@Nullable
		private Long incompatibleDiffs;

		@Nullable
		private Long compatibleDiffs;

		/**
		 * Number of published cluster states.
		 * <p>
		 * API name: {@code full_states}
		 */
		public final Builder fullStates(@Nullable Long value) {
			this.fullStates = value;
			return this;
		}

		/**
		 * Number of incompatible differences between published cluster states.
		 * <p>
		 * API name: {@code incompatible_diffs}
		 */
		public final Builder incompatibleDiffs(@Nullable Long value) {
			this.incompatibleDiffs = value;
			return this;
		}

		/**
		 * Number of compatible differences between published cluster states.
		 * <p>
		 * API name: {@code compatible_diffs}
		 */
		public final Builder compatibleDiffs(@Nullable Long value) {
			this.compatibleDiffs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PublishedClusterStates}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PublishedClusterStates build() {
			_checkSingleUse();

			return new PublishedClusterStates(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PublishedClusterStates}
	 */
	public static final JsonpDeserializer<PublishedClusterStates> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PublishedClusterStates::setupPublishedClusterStatesDeserializer);

	protected static void setupPublishedClusterStatesDeserializer(
			ObjectDeserializer<PublishedClusterStates.Builder> op) {

		op.add(Builder::fullStates, JsonpDeserializer.longDeserializer(), "full_states");
		op.add(Builder::incompatibleDiffs, JsonpDeserializer.longDeserializer(), "incompatible_diffs");
		op.add(Builder::compatibleDiffs, JsonpDeserializer.longDeserializer(), "compatible_diffs");

	}

}
