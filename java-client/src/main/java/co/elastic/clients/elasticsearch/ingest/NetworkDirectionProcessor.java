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

// typedef: ingest._types.NetworkDirectionProcessor

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.NetworkDirectionProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class NetworkDirectionProcessor extends ProcessorBase implements ProcessorVariant {
	@Nullable
	private final String sourceIp;

	@Nullable
	private final String destinationIp;

	@Nullable
	private final String targetField;

	private final List<String> internalNetworks;

	@Nullable
	private final String internalNetworksField;

	@Nullable
	private final Boolean ignoreMissing;

	// ---------------------------------------------------------------------------------------------

	private NetworkDirectionProcessor(Builder builder) {
		super(builder);

		this.sourceIp = builder.sourceIp;
		this.destinationIp = builder.destinationIp;
		this.targetField = builder.targetField;
		this.internalNetworks = ApiTypeHelper.unmodifiable(builder.internalNetworks);
		this.internalNetworksField = builder.internalNetworksField;
		this.ignoreMissing = builder.ignoreMissing;

	}

	public static NetworkDirectionProcessor of(Function<Builder, ObjectBuilder<NetworkDirectionProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.NetworkDirection;
	}

	/**
	 * Field containing the source IP address.
	 * <p>
	 * API name: {@code source_ip}
	 */
	@Nullable
	public final String sourceIp() {
		return this.sourceIp;
	}

	/**
	 * Field containing the destination IP address.
	 * <p>
	 * API name: {@code destination_ip}
	 */
	@Nullable
	public final String destinationIp() {
		return this.destinationIp;
	}

	/**
	 * Output field for the network direction.
	 * <p>
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * List of internal networks. Supports IPv4 and IPv6 addresses and ranges in
	 * CIDR notation. Also supports the named ranges listed below. These may be
	 * constructed with template snippets. Must specify only one of
	 * internal_networks or internal_networks_field.
	 * <p>
	 * API name: {@code internal_networks}
	 */
	public final List<String> internalNetworks() {
		return this.internalNetworks;
	}

	/**
	 * A field on the given document to read the internal_networks configuration
	 * from.
	 * <p>
	 * API name: {@code internal_networks_field}
	 */
	@Nullable
	public final String internalNetworksField() {
		return this.internalNetworksField;
	}

	/**
	 * If true and any required fields are missing, the processor quietly exits
	 * without modifying the document.
	 * <p>
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.sourceIp != null) {
			generator.writeKey("source_ip");
			generator.write(this.sourceIp);

		}
		if (this.destinationIp != null) {
			generator.writeKey("destination_ip");
			generator.write(this.destinationIp);

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (ApiTypeHelper.isDefined(this.internalNetworks)) {
			generator.writeKey("internal_networks");
			generator.writeStartArray();
			for (String item0 : this.internalNetworks) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.internalNetworksField != null) {
			generator.writeKey("internal_networks_field");
			generator.write(this.internalNetworksField);

		}
		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NetworkDirectionProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NetworkDirectionProcessor> {
		@Nullable
		private String sourceIp;

		@Nullable
		private String destinationIp;

		@Nullable
		private String targetField;

		@Nullable
		private List<String> internalNetworks;

		@Nullable
		private String internalNetworksField;

		@Nullable
		private Boolean ignoreMissing;

		public Builder() {
		}
		private Builder(NetworkDirectionProcessor instance) {
			this.sourceIp = instance.sourceIp;
			this.destinationIp = instance.destinationIp;
			this.targetField = instance.targetField;
			this.internalNetworks = instance.internalNetworks;
			this.internalNetworksField = instance.internalNetworksField;
			this.ignoreMissing = instance.ignoreMissing;

		}
		/**
		 * Field containing the source IP address.
		 * <p>
		 * API name: {@code source_ip}
		 */
		public final Builder sourceIp(@Nullable String value) {
			this.sourceIp = value;
			return this;
		}

		/**
		 * Field containing the destination IP address.
		 * <p>
		 * API name: {@code destination_ip}
		 */
		public final Builder destinationIp(@Nullable String value) {
			this.destinationIp = value;
			return this;
		}

		/**
		 * Output field for the network direction.
		 * <p>
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * List of internal networks. Supports IPv4 and IPv6 addresses and ranges in
		 * CIDR notation. Also supports the named ranges listed below. These may be
		 * constructed with template snippets. Must specify only one of
		 * internal_networks or internal_networks_field.
		 * <p>
		 * API name: {@code internal_networks}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>internalNetworks</code>.
		 */
		public final Builder internalNetworks(List<String> list) {
			this.internalNetworks = _listAddAll(this.internalNetworks, list);
			return this;
		}

		/**
		 * List of internal networks. Supports IPv4 and IPv6 addresses and ranges in
		 * CIDR notation. Also supports the named ranges listed below. These may be
		 * constructed with template snippets. Must specify only one of
		 * internal_networks or internal_networks_field.
		 * <p>
		 * API name: {@code internal_networks}
		 * <p>
		 * Adds one or more values to <code>internalNetworks</code>.
		 */
		public final Builder internalNetworks(String value, String... values) {
			this.internalNetworks = _listAdd(this.internalNetworks, value, values);
			return this;
		}

		/**
		 * A field on the given document to read the internal_networks configuration
		 * from.
		 * <p>
		 * API name: {@code internal_networks_field}
		 */
		public final Builder internalNetworksField(@Nullable String value) {
			this.internalNetworksField = value;
			return this;
		}

		/**
		 * If true and any required fields are missing, the processor quietly exits
		 * without modifying the document.
		 * <p>
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NetworkDirectionProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NetworkDirectionProcessor build() {
			_checkSingleUse();

			return new NetworkDirectionProcessor(this);
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
	 * Json deserializer for {@link NetworkDirectionProcessor}
	 */
	public static final JsonpDeserializer<NetworkDirectionProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NetworkDirectionProcessor::setupNetworkDirectionProcessorDeserializer);

	protected static void setupNetworkDirectionProcessorDeserializer(
			ObjectDeserializer<NetworkDirectionProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::sourceIp, JsonpDeserializer.stringDeserializer(), "source_ip");
		op.add(Builder::destinationIp, JsonpDeserializer.stringDeserializer(), "destination_ip");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::internalNetworks, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"internal_networks");
		op.add(Builder::internalNetworksField, JsonpDeserializer.stringDeserializer(), "internal_networks_field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");

	}

}
