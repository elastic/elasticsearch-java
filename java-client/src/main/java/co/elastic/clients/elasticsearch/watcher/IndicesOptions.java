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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.IndicesOptions
@JsonpDeserializable
public class IndicesOptions implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean ignoreThrottled;

	// ---------------------------------------------------------------------------------------------

	private IndicesOptions(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.ignoreThrottled = builder.ignoreThrottled;

	}

	public static IndicesOptions of(Function<Builder, ObjectBuilder<IndicesOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public final Boolean ignoreThrottled() {
		return this.ignoreThrottled;
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

		if (this.allowNoIndices != null) {
			generator.writeKey("allow_no_indices");
			generator.write(this.allowNoIndices);

		}
		if (ModelTypeHelper.isDefined(this.expandWildcards)) {
			generator.writeKey("expand_wildcards");
			generator.writeStartArray();
			for (ExpandWildcardOptions item0 : this.expandWildcards) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.ignoreUnavailable != null) {
			generator.writeKey("ignore_unavailable");
			generator.write(this.ignoreUnavailable);

		}
		if (this.ignoreThrottled != null) {
			generator.writeKey("ignore_throttled");
			generator.write(this.ignoreThrottled);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesOptions}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndicesOptions> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean ignoreThrottled;

		/**
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code ignore_throttled}
		 */
		public final Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesOptions build() {
			_checkSingleUse();

			return new IndicesOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesOptions}
	 */
	public static final JsonpDeserializer<IndicesOptions> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndicesOptions::setupIndicesOptionsDeserializer, Builder::build);

	protected static void setupIndicesOptionsDeserializer(DelegatingDeserializer<IndicesOptions.Builder> op) {

		op.add(Builder::allowNoIndices, JsonpDeserializer.booleanDeserializer(), "allow_no_indices");
		op.add(Builder::expandWildcards, JsonpDeserializer.arrayDeserializer(ExpandWildcardOptions._DESERIALIZER),
				"expand_wildcards");
		op.add(Builder::ignoreUnavailable, JsonpDeserializer.booleanDeserializer(), "ignore_unavailable");
		op.add(Builder::ignoreThrottled, JsonpDeserializer.booleanDeserializer(), "ignore_throttled");

	}

}
