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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.DynamicTemplate
public final class DynamicTemplate implements ToJsonp {
	@Nullable
	private final PropertyBase mapping;

	@Nullable
	private final String match;

	@Nullable
	private final String matchMappingType;

	@Nullable
	private final JsonValue matchPattern;

	@Nullable
	private final String pathMatch;

	@Nullable
	private final String pathUnmatch;

	@Nullable
	private final String unmatch;

	// ---------------------------------------------------------------------------------------------

	protected DynamicTemplate(Builder builder) {

		this.mapping = builder.mapping;
		this.match = builder.match;
		this.matchMappingType = builder.matchMappingType;
		this.matchPattern = builder.matchPattern;
		this.pathMatch = builder.pathMatch;
		this.pathUnmatch = builder.pathUnmatch;
		this.unmatch = builder.unmatch;

	}

	/**
	 * API name: {@code mapping}
	 */
	@Nullable
	public PropertyBase mapping() {
		return this.mapping;
	}

	/**
	 * API name: {@code match}
	 */
	@Nullable
	public String match() {
		return this.match;
	}

	/**
	 * API name: {@code match_mapping_type}
	 */
	@Nullable
	public String matchMappingType() {
		return this.matchMappingType;
	}

	/**
	 * API name: {@code match_pattern}
	 */
	@Nullable
	public JsonValue matchPattern() {
		return this.matchPattern;
	}

	/**
	 * API name: {@code path_match}
	 */
	@Nullable
	public String pathMatch() {
		return this.pathMatch;
	}

	/**
	 * API name: {@code path_unmatch}
	 */
	@Nullable
	public String pathUnmatch() {
		return this.pathUnmatch;
	}

	/**
	 * API name: {@code unmatch}
	 */
	@Nullable
	public String unmatch() {
		return this.unmatch;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.mapping != null) {

			generator.writeKey("mapping");
			this.mapping.toJsonp(generator, mapper);

		}
		if (this.match != null) {

			generator.writeKey("match");
			generator.write(this.match);

		}
		if (this.matchMappingType != null) {

			generator.writeKey("match_mapping_type");
			generator.write(this.matchMappingType);

		}
		if (this.matchPattern != null) {

			generator.writeKey("match_pattern");
			generator.write(this.matchPattern);

		}
		if (this.pathMatch != null) {

			generator.writeKey("path_match");
			generator.write(this.pathMatch);

		}
		if (this.pathUnmatch != null) {

			generator.writeKey("path_unmatch");
			generator.write(this.pathUnmatch);

		}
		if (this.unmatch != null) {

			generator.writeKey("unmatch");
			generator.write(this.unmatch);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DynamicTemplate}.
	 */
	public static class Builder implements ObjectBuilder<DynamicTemplate> {
		@Nullable
		private PropertyBase mapping;

		@Nullable
		private String match;

		@Nullable
		private String matchMappingType;

		@Nullable
		private JsonValue matchPattern;

		@Nullable
		private String pathMatch;

		@Nullable
		private String pathUnmatch;

		@Nullable
		private String unmatch;

		/**
		 * API name: {@code mapping}
		 */
		public Builder mapping(@Nullable PropertyBase value) {
			this.mapping = value;
			return this;
		}

		/**
		 * API name: {@code mapping}
		 */
		public Builder mapping(Function<PropertyBase.Builder, ObjectBuilder<PropertyBase>> fn) {
			return this.mapping(fn.apply(new PropertyBase.Builder()).build());
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(@Nullable String value) {
			this.match = value;
			return this;
		}

		/**
		 * API name: {@code match_mapping_type}
		 */
		public Builder matchMappingType(@Nullable String value) {
			this.matchMappingType = value;
			return this;
		}

		/**
		 * API name: {@code match_pattern}
		 */
		public Builder matchPattern(@Nullable JsonValue value) {
			this.matchPattern = value;
			return this;
		}

		/**
		 * API name: {@code path_match}
		 */
		public Builder pathMatch(@Nullable String value) {
			this.pathMatch = value;
			return this;
		}

		/**
		 * API name: {@code path_unmatch}
		 */
		public Builder pathUnmatch(@Nullable String value) {
			this.pathUnmatch = value;
			return this;
		}

		/**
		 * API name: {@code unmatch}
		 */
		public Builder unmatch(@Nullable String value) {
			this.unmatch = value;
			return this;
		}

		/**
		 * Builds a {@link DynamicTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DynamicTemplate build() {

			return new DynamicTemplate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DynamicTemplate
	 */
	public static final JsonpDeserializer<DynamicTemplate> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DynamicTemplate::setupDynamicTemplateDeserializer);

	protected static void setupDynamicTemplateDeserializer(DelegatingDeserializer<DynamicTemplate.Builder> op) {

		op.add(Builder::mapping, PropertyBase.DESERIALIZER, "mapping");
		op.add(Builder::match, JsonpDeserializer.stringDeserializer(), "match");
		op.add(Builder::matchMappingType, JsonpDeserializer.stringDeserializer(), "match_mapping_type");
		op.add(Builder::matchPattern, JsonpDeserializer.jsonValueDeserializer(), "match_pattern");
		op.add(Builder::pathMatch, JsonpDeserializer.stringDeserializer(), "path_match");
		op.add(Builder::pathUnmatch, JsonpDeserializer.stringDeserializer(), "path_unmatch");
		op.add(Builder::unmatch, JsonpDeserializer.stringDeserializer(), "unmatch");

	}

}
