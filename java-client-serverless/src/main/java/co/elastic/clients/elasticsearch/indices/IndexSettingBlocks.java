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

package co.elastic.clients.elasticsearch.indices;

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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettingBlocks

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexSettingBlocks">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexSettingBlocks implements JsonpSerializable {
	@Nullable
	private final Boolean readOnly;

	@Nullable
	private final Boolean readOnlyAllowDelete;

	@Nullable
	private final Boolean read;

	@Nullable
	private final Boolean write;

	@Nullable
	private final Boolean metadata;

	// ---------------------------------------------------------------------------------------------

	private IndexSettingBlocks(Builder builder) {

		this.readOnly = builder.readOnly;
		this.readOnlyAllowDelete = builder.readOnlyAllowDelete;
		this.read = builder.read;
		this.write = builder.write;
		this.metadata = builder.metadata;

	}

	public static IndexSettingBlocks of(Function<Builder, ObjectBuilder<IndexSettingBlocks>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code read_only}
	 */
	@Nullable
	public final Boolean readOnly() {
		return this.readOnly;
	}

	/**
	 * API name: {@code read_only_allow_delete}
	 */
	@Nullable
	public final Boolean readOnlyAllowDelete() {
		return this.readOnlyAllowDelete;
	}

	/**
	 * API name: {@code read}
	 */
	@Nullable
	public final Boolean read() {
		return this.read;
	}

	/**
	 * API name: {@code write}
	 */
	@Nullable
	public final Boolean write() {
		return this.write;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public final Boolean metadata() {
		return this.metadata;
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

		if (this.readOnly != null) {
			generator.writeKey("read_only");
			generator.write(this.readOnly);

		}
		if (this.readOnlyAllowDelete != null) {
			generator.writeKey("read_only_allow_delete");
			generator.write(this.readOnlyAllowDelete);

		}
		if (this.read != null) {
			generator.writeKey("read");
			generator.write(this.read);

		}
		if (this.write != null) {
			generator.writeKey("write");
			generator.write(this.write);

		}
		if (this.metadata != null) {
			generator.writeKey("metadata");
			generator.write(this.metadata);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingBlocks}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexSettingBlocks> {
		@Nullable
		private Boolean readOnly;

		@Nullable
		private Boolean readOnlyAllowDelete;

		@Nullable
		private Boolean read;

		@Nullable
		private Boolean write;

		@Nullable
		private Boolean metadata;

		/**
		 * API name: {@code read_only}
		 */
		public final Builder readOnly(@Nullable Boolean value) {
			this.readOnly = value;
			return this;
		}

		/**
		 * API name: {@code read_only_allow_delete}
		 */
		public final Builder readOnlyAllowDelete(@Nullable Boolean value) {
			this.readOnlyAllowDelete = value;
			return this;
		}

		/**
		 * API name: {@code read}
		 */
		public final Builder read(@Nullable Boolean value) {
			this.read = value;
			return this;
		}

		/**
		 * API name: {@code write}
		 */
		public final Builder write(@Nullable Boolean value) {
			this.write = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable Boolean value) {
			this.metadata = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSettingBlocks}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingBlocks build() {
			_checkSingleUse();

			return new IndexSettingBlocks(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexSettingBlocks}
	 */
	public static final JsonpDeserializer<IndexSettingBlocks> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexSettingBlocks::setupIndexSettingBlocksDeserializer);

	protected static void setupIndexSettingBlocksDeserializer(ObjectDeserializer<IndexSettingBlocks.Builder> op) {

		op.add(Builder::readOnly, JsonpDeserializer.booleanDeserializer(), "read_only");
		op.add(Builder::readOnlyAllowDelete, JsonpDeserializer.booleanDeserializer(), "read_only_allow_delete");
		op.add(Builder::read, JsonpDeserializer.booleanDeserializer(), "read");
		op.add(Builder::write, JsonpDeserializer.booleanDeserializer(), "write");
		op.add(Builder::metadata, JsonpDeserializer.booleanDeserializer(), "metadata");

	}

}
