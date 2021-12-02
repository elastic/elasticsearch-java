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
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.UserAgentProcessor

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/ingest/_types/Processors.ts#L113-L119">API
 *      specification</a>
 */
@JsonpDeserializable
public class UserAgentProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final boolean ignoreMissing;

	private final List<UserAgentProperty> options;

	private final String regexFile;

	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	private UserAgentProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = ApiTypeHelper.requireNonNull(builder.ignoreMissing, this, "ignoreMissing");
		this.options = ApiTypeHelper.unmodifiableRequired(builder.options, this, "options");
		this.regexFile = ApiTypeHelper.requireNonNull(builder.regexFile, this, "regexFile");
		this.targetField = ApiTypeHelper.requireNonNull(builder.targetField, this, "targetField");

	}

	public static UserAgentProcessor of(Function<Builder, ObjectBuilder<UserAgentProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.UserAgent;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code ignore_missing}
	 */
	public final boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * Required - API name: {@code options}
	 */
	public final List<UserAgentProperty> options() {
		return this.options;
	}

	/**
	 * Required - API name: {@code regex_file}
	 */
	public final String regexFile() {
		return this.regexFile;
	}

	/**
	 * Required - API name: {@code target_field}
	 */
	public final String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("ignore_missing");
		generator.write(this.ignoreMissing);

		if (ApiTypeHelper.isDefined(this.options)) {
			generator.writeKey("options");
			generator.writeStartArray();
			for (UserAgentProperty item0 : this.options) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		generator.writeKey("regex_file");
		generator.write(this.regexFile);

		generator.writeKey("target_field");
		generator.write(this.targetField);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UserAgentProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UserAgentProcessor> {
		private String field;

		private Boolean ignoreMissing;

		private List<UserAgentProperty> options;

		private String regexFile;

		private String targetField;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>options</code>.
		 */
		public final Builder options(List<UserAgentProperty> list) {
			this.options = _listAddAll(this.options, list);
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds one or more values to <code>options</code>.
		 */
		public final Builder options(UserAgentProperty value, UserAgentProperty... values) {
			this.options = _listAdd(this.options, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code regex_file}
		 */
		public final Builder regexFile(String value) {
			this.regexFile = value;
			return this;
		}

		/**
		 * Required - API name: {@code target_field}
		 */
		public final Builder targetField(String value) {
			this.targetField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UserAgentProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UserAgentProcessor build() {
			_checkSingleUse();

			return new UserAgentProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UserAgentProcessor}
	 */
	public static final JsonpDeserializer<UserAgentProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UserAgentProcessor::setupUserAgentProcessorDeserializer);

	protected static void setupUserAgentProcessorDeserializer(ObjectDeserializer<UserAgentProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::options, JsonpDeserializer.arrayDeserializer(UserAgentProperty._DESERIALIZER), "options");
		op.add(Builder::regexFile, JsonpDeserializer.stringDeserializer(), "regex_file");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
