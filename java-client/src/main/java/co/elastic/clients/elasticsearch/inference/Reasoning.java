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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference._types.Reasoning

/**
 * The reasoning configuration to use for the completion request. Currently
 * supported only for <code>elastic</code> provider.
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.Reasoning">API
 *      specification</a>
 */
@JsonpDeserializable
public class Reasoning implements JsonpSerializable {
	@Nullable
	private final ReasoningEffort effort;

	@Nullable
	private final Boolean enabled;

	@Nullable
	private final Boolean exclude;

	@Nullable
	private final ReasoningSummary summary;

	// ---------------------------------------------------------------------------------------------

	private Reasoning(Builder builder) {

		this.effort = builder.effort;
		this.enabled = builder.enabled;
		this.exclude = builder.exclude;
		this.summary = builder.summary;

	}

	public static Reasoning of(Function<Builder, ObjectBuilder<Reasoning>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The level of effort the model should put into reasoning. This is a hint that
	 * guides the model in how much effort to put into reasoning, with
	 * <code>xhigh</code> being the most effort and <code>none</code> being no
	 * effort.
	 * <p>
	 * API name: {@code effort}
	 */
	@Nullable
	public final ReasoningEffort effort() {
		return this.effort;
	}

	/**
	 * Whether to enable reasoning with default settings. This is a shortcut for
	 * enabling reasoning without having to specify the other parameters. If
	 * <code>enabled</code> is set to <code>true</code>, then reasoning at the
	 * <code>medium</code> effort level is enabled. Ignored if <code>effort</code>
	 * is specified, in which case that parameter will control the reasoning process
	 * instead.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * Whether to exclude reasoning information from the response. If
	 * <code>true</code>, the response will not include any reasoning details.
	 * <p>
	 * API name: {@code exclude}
	 */
	@Nullable
	public final Boolean exclude() {
		return this.exclude;
	}

	/**
	 * The level of detail included in the reasoning summary returned in the
	 * response. This is a hint on how much detail to include in the summary of the
	 * reasoning that is returned in the response, with <code>auto</code> being the
	 * default level of detail, <code>concise</code> being less detail, and
	 * <code>detailed</code> being more detail.
	 * <p>
	 * API name: {@code summary}
	 */
	@Nullable
	public final ReasoningSummary summary() {
		return this.summary;
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

		if (this.effort != null) {
			generator.writeKey("effort");
			this.effort.serialize(generator, mapper);
		}
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.exclude != null) {
			generator.writeKey("exclude");
			generator.write(this.exclude);

		}
		if (this.summary != null) {
			generator.writeKey("summary");
			this.summary.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Reasoning}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Reasoning> {
		@Nullable
		private ReasoningEffort effort;

		@Nullable
		private Boolean enabled;

		@Nullable
		private Boolean exclude;

		@Nullable
		private ReasoningSummary summary;

		public Builder() {
		}
		private Builder(Reasoning instance) {
			this.effort = instance.effort;
			this.enabled = instance.enabled;
			this.exclude = instance.exclude;
			this.summary = instance.summary;

		}
		/**
		 * The level of effort the model should put into reasoning. This is a hint that
		 * guides the model in how much effort to put into reasoning, with
		 * <code>xhigh</code> being the most effort and <code>none</code> being no
		 * effort.
		 * <p>
		 * API name: {@code effort}
		 */
		public final Builder effort(@Nullable ReasoningEffort value) {
			this.effort = value;
			return this;
		}

		/**
		 * Whether to enable reasoning with default settings. This is a shortcut for
		 * enabling reasoning without having to specify the other parameters. If
		 * <code>enabled</code> is set to <code>true</code>, then reasoning at the
		 * <code>medium</code> effort level is enabled. Ignored if <code>effort</code>
		 * is specified, in which case that parameter will control the reasoning process
		 * instead.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Whether to exclude reasoning information from the response. If
		 * <code>true</code>, the response will not include any reasoning details.
		 * <p>
		 * API name: {@code exclude}
		 */
		public final Builder exclude(@Nullable Boolean value) {
			this.exclude = value;
			return this;
		}

		/**
		 * The level of detail included in the reasoning summary returned in the
		 * response. This is a hint on how much detail to include in the summary of the
		 * reasoning that is returned in the response, with <code>auto</code> being the
		 * default level of detail, <code>concise</code> being less detail, and
		 * <code>detailed</code> being more detail.
		 * <p>
		 * API name: {@code summary}
		 */
		public final Builder summary(@Nullable ReasoningSummary value) {
			this.summary = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Reasoning}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Reasoning build() {
			_checkSingleUse();

			return new Reasoning(this);
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
	 * Json deserializer for {@link Reasoning}
	 */
	public static final JsonpDeserializer<Reasoning> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Reasoning::setupReasoningDeserializer);

	protected static void setupReasoningDeserializer(ObjectDeserializer<Reasoning.Builder> op) {

		op.add(Builder::effort, ReasoningEffort._DESERIALIZER, "effort");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::exclude, JsonpDeserializer.booleanDeserializer(), "exclude");
		op.add(Builder::summary, ReasoningSummary._DESERIALIZER, "summary");

	}

}
