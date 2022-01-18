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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.JoinProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.JoinProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class JoinProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final String separator;

	@Nullable
	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	private JoinProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.separator = ApiTypeHelper.requireNonNull(builder.separator, this, "separator");
		this.targetField = builder.targetField;

	}

	public static JoinProcessor of(Function<Builder, ObjectBuilder<JoinProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Join;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code separator}
	 */
	public final String separator() {
		return this.separator;
	}

	/**
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("separator");
		generator.write(this.separator);

		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JoinProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<JoinProcessor> {
		private String field;

		private String separator;

		@Nullable
		private String targetField;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code separator}
		 */
		public final Builder separator(String value) {
			this.separator = value;
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JoinProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JoinProcessor build() {
			_checkSingleUse();

			return new JoinProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JoinProcessor}
	 */
	public static final JsonpDeserializer<JoinProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JoinProcessor::setupJoinProcessorDeserializer);

	protected static void setupJoinProcessorDeserializer(ObjectDeserializer<JoinProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::separator, JsonpDeserializer.stringDeserializer(), "separator");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
