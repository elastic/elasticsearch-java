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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
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

// typedef: ingest._types.CommunityIDProcessor

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.CommunityIDProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class CommunityIDProcessor extends ProcessorBase implements ProcessorVariant {
	@Nullable
	private final String sourceIp;

	@Nullable
	private final String sourcePort;

	@Nullable
	private final String destinationIp;

	@Nullable
	private final String destinationPort;

	@Nullable
	private final String ianaNumber;

	@Nullable
	private final String icmpType;

	@Nullable
	private final String icmpCode;

	@Nullable
	private final String transport;

	@Nullable
	private final String targetField;

	@Nullable
	private final Integer seed;

	@Nullable
	private final Boolean ignoreMissing;

	// ---------------------------------------------------------------------------------------------

	private CommunityIDProcessor(Builder builder) {
		super(builder);

		this.sourceIp = builder.sourceIp;
		this.sourcePort = builder.sourcePort;
		this.destinationIp = builder.destinationIp;
		this.destinationPort = builder.destinationPort;
		this.ianaNumber = builder.ianaNumber;
		this.icmpType = builder.icmpType;
		this.icmpCode = builder.icmpCode;
		this.transport = builder.transport;
		this.targetField = builder.targetField;
		this.seed = builder.seed;
		this.ignoreMissing = builder.ignoreMissing;

	}

	public static CommunityIDProcessor of(Function<Builder, ObjectBuilder<CommunityIDProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.CommunityId;
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
	 * Field containing the source port.
	 * <p>
	 * API name: {@code source_port}
	 */
	@Nullable
	public final String sourcePort() {
		return this.sourcePort;
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
	 * Field containing the destination port.
	 * <p>
	 * API name: {@code destination_port}
	 */
	@Nullable
	public final String destinationPort() {
		return this.destinationPort;
	}

	/**
	 * Field containing the IANA number.
	 * <p>
	 * API name: {@code iana_number}
	 */
	@Nullable
	public final String ianaNumber() {
		return this.ianaNumber;
	}

	/**
	 * Field containing the ICMP type.
	 * <p>
	 * API name: {@code icmp_type}
	 */
	@Nullable
	public final String icmpType() {
		return this.icmpType;
	}

	/**
	 * Field containing the ICMP code.
	 * <p>
	 * API name: {@code icmp_code}
	 */
	@Nullable
	public final String icmpCode() {
		return this.icmpCode;
	}

	/**
	 * Field containing the transport protocol name or number. Used only when the
	 * iana_number field is not present. The following protocol names are currently
	 * supported: eigrp, gre, icmp, icmpv6, igmp, ipv6-icmp, ospf, pim, sctp, tcp,
	 * udp
	 * <p>
	 * API name: {@code transport}
	 */
	@Nullable
	public final String transport() {
		return this.transport;
	}

	/**
	 * Output field for the community ID.
	 * <p>
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * Seed for the community ID hash. Must be between 0 and 65535 (inclusive). The
	 * seed can prevent hash collisions between network domains, such as a staging
	 * and production network that use the same addressing scheme.
	 * <p>
	 * API name: {@code seed}
	 */
	@Nullable
	public final Integer seed() {
		return this.seed;
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
		if (this.sourcePort != null) {
			generator.writeKey("source_port");
			generator.write(this.sourcePort);

		}
		if (this.destinationIp != null) {
			generator.writeKey("destination_ip");
			generator.write(this.destinationIp);

		}
		if (this.destinationPort != null) {
			generator.writeKey("destination_port");
			generator.write(this.destinationPort);

		}
		if (this.ianaNumber != null) {
			generator.writeKey("iana_number");
			generator.write(this.ianaNumber);

		}
		if (this.icmpType != null) {
			generator.writeKey("icmp_type");
			generator.write(this.icmpType);

		}
		if (this.icmpCode != null) {
			generator.writeKey("icmp_code");
			generator.write(this.icmpCode);

		}
		if (this.transport != null) {
			generator.writeKey("transport");
			generator.write(this.transport);

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.seed != null) {
			generator.writeKey("seed");
			generator.write(this.seed);

		}
		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CommunityIDProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CommunityIDProcessor> {
		@Nullable
		private String sourceIp;

		@Nullable
		private String sourcePort;

		@Nullable
		private String destinationIp;

		@Nullable
		private String destinationPort;

		@Nullable
		private String ianaNumber;

		@Nullable
		private String icmpType;

		@Nullable
		private String icmpCode;

		@Nullable
		private String transport;

		@Nullable
		private String targetField;

		@Nullable
		private Integer seed;

		@Nullable
		private Boolean ignoreMissing;

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
		 * Field containing the source port.
		 * <p>
		 * API name: {@code source_port}
		 */
		public final Builder sourcePort(@Nullable String value) {
			this.sourcePort = value;
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
		 * Field containing the destination port.
		 * <p>
		 * API name: {@code destination_port}
		 */
		public final Builder destinationPort(@Nullable String value) {
			this.destinationPort = value;
			return this;
		}

		/**
		 * Field containing the IANA number.
		 * <p>
		 * API name: {@code iana_number}
		 */
		public final Builder ianaNumber(@Nullable String value) {
			this.ianaNumber = value;
			return this;
		}

		/**
		 * Field containing the ICMP type.
		 * <p>
		 * API name: {@code icmp_type}
		 */
		public final Builder icmpType(@Nullable String value) {
			this.icmpType = value;
			return this;
		}

		/**
		 * Field containing the ICMP code.
		 * <p>
		 * API name: {@code icmp_code}
		 */
		public final Builder icmpCode(@Nullable String value) {
			this.icmpCode = value;
			return this;
		}

		/**
		 * Field containing the transport protocol name or number. Used only when the
		 * iana_number field is not present. The following protocol names are currently
		 * supported: eigrp, gre, icmp, icmpv6, igmp, ipv6-icmp, ospf, pim, sctp, tcp,
		 * udp
		 * <p>
		 * API name: {@code transport}
		 */
		public final Builder transport(@Nullable String value) {
			this.transport = value;
			return this;
		}

		/**
		 * Output field for the community ID.
		 * <p>
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * Seed for the community ID hash. Must be between 0 and 65535 (inclusive). The
		 * seed can prevent hash collisions between network domains, such as a staging
		 * and production network that use the same addressing scheme.
		 * <p>
		 * API name: {@code seed}
		 */
		public final Builder seed(@Nullable Integer value) {
			this.seed = value;
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
		 * Builds a {@link CommunityIDProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CommunityIDProcessor build() {
			_checkSingleUse();

			return new CommunityIDProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CommunityIDProcessor}
	 */
	public static final JsonpDeserializer<CommunityIDProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CommunityIDProcessor::setupCommunityIDProcessorDeserializer);

	protected static void setupCommunityIDProcessorDeserializer(ObjectDeserializer<CommunityIDProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::sourceIp, JsonpDeserializer.stringDeserializer(), "source_ip");
		op.add(Builder::sourcePort, JsonpDeserializer.stringDeserializer(), "source_port");
		op.add(Builder::destinationIp, JsonpDeserializer.stringDeserializer(), "destination_ip");
		op.add(Builder::destinationPort, JsonpDeserializer.stringDeserializer(), "destination_port");
		op.add(Builder::ianaNumber, JsonpDeserializer.stringDeserializer(), "iana_number");
		op.add(Builder::icmpType, JsonpDeserializer.stringDeserializer(), "icmp_type");
		op.add(Builder::icmpCode, JsonpDeserializer.stringDeserializer(), "icmp_code");
		op.add(Builder::transport, JsonpDeserializer.stringDeserializer(), "transport");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::seed, JsonpDeserializer.integerDeserializer(), "seed");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");

	}

}
