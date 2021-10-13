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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.MappingCharFilter
@JsonpDeserializable
public final class MappingCharFilter extends CharFilterBase implements CharFilterVariant {
	private final List<String> mappings;

	private final String mappingsPath;

	// ---------------------------------------------------------------------------------------------

	public MappingCharFilter(Builder builder) {
		super(builder);

		this.mappings = ModelTypeHelper.unmodifiableNonNull(builder.mappings, "mappings");
		this.mappingsPath = Objects.requireNonNull(builder.mappingsPath, "mappings_path");

	}

	public MappingCharFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link CharFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "mapping";
	}

	/**
	 * Required - API name: {@code mappings}
	 */
	public List<String> mappings() {
		return this.mappings;
	}

	/**
	 * Required - API name: {@code mappings_path}
	 */
	public String mappingsPath() {
		return this.mappingsPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "mapping");
		super.serializeInternal(generator, mapper);

		generator.writeKey("mappings");
		generator.writeStartArray();
		for (String item0 : this.mappings) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("mappings_path");
		generator.write(this.mappingsPath);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MappingCharFilter}.
	 */
	public static class Builder extends CharFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MappingCharFilter> {
		private List<String> mappings;

		private String mappingsPath;

		/**
		 * Required - API name: {@code mappings}
		 */
		public Builder mappings(List<String> value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public Builder mappings(String... value) {
			this.mappings = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #mappings(List)}, creating the list if needed.
		 */
		public Builder addMappings(String value) {
			if (this.mappings == null) {
				this.mappings = new ArrayList<>();
			}
			this.mappings.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code mappings_path}
		 */
		public Builder mappingsPath(String value) {
			this.mappingsPath = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MappingCharFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MappingCharFilter build() {

			return new MappingCharFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MappingCharFilter}
	 */
	public static final JsonpDeserializer<MappingCharFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MappingCharFilter::setupMappingCharFilterDeserializer, Builder::build);

	protected static void setupMappingCharFilterDeserializer(DelegatingDeserializer<MappingCharFilter.Builder> op) {
		CharFilterBase.setupCharFilterBaseDeserializer(op);
		op.add(Builder::mappings, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"mappings");
		op.add(Builder::mappingsPath, JsonpDeserializer.stringDeserializer(), "mappings_path");

		op.ignore("type");
	}

}
